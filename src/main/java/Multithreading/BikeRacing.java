package Multithreading;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Getter
class Biker implements Runnable{
    private String name;
    private Long startTime;
    private Long endTime;
    private Long completionTime;
    private final CountDownLatch latch;
    Biker(String n,CountDownLatch latch){
        name = n;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        startTime = System.currentTimeMillis();
        System.out.println(name+ " started at " + startTime);
        completionTime = new Random().nextLong(4000)+1000;
        try {
            Thread.sleep(completionTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        endTime = startTime+completionTime;
        System.out.println(name+ " ended at "+endTime);
    }
}
public class BikeRacing {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(1);
        List<Biker> bikers = getBikers(latch);
        bikers.forEach(executorService::submit);

        latch.countDown();
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Some threads did not finish in the given time.");
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }


        bikers.sort((x,y)->(x.getCompletionTime()).compareTo(y.getCompletionTime()));
        int rank = 1;
        for(Biker b:bikers){
            System.out.println("Rank: "+rank++ +", Biker Name : "+b.getName()+" ,startTime: "+b.getStartTime()+" ,endTime: "+ b.getEndTime()+" ,completionTime(in ms): "+b.getCompletionTime());
        }

    }

    private static List<Biker> getBikers(CountDownLatch latch) {
        Biker b1 = new Biker("Biker 1", latch);
        Biker b2 = new Biker("Biker 2", latch);
        Biker b3 = new Biker("Biker 3", latch);
        Biker b4 = new Biker("Biker 4", latch);
        Biker b5 = new Biker("Biker 5", latch);
        Biker b6 = new Biker("Biker 6", latch);
        Biker b7 = new Biker("Biker 7", latch);
        Biker b8 = new Biker("Biker 8", latch);
        Biker b9 = new Biker("Biker 9", latch);
        Biker b10 = new Biker("Biker 10", latch);
        return Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10);
    }
}
