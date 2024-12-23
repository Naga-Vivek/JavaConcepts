package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ESFDemo {
    public static void main(String[] args) throws Exception{
        ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        Future<Integer> f1 = es.submit(new Sum(5));
        Future<Integer> f2 = es.submit(new Sum(500));
        Future<Integer> f3 = es.submit(new Sum(5000));
        Future<Integer> f4 = es.submit(new Sum(100000));

        es.submit(new SomeThread());

        System.out.println("Program Continues.....");

        System.out.println("Sum(5) : "+f1.get());
        System.out.println("Sum(500) : "+f2.get());
        System.out.println("Sum(5000) : "+f3.get());
        System.out.println("Sum(100000) : "+f4.get());

        es.shutdown();

    }
}
class Sum implements Callable<Integer>{
    int val;
    Sum(int val){
        this.val = val;
    }
    public Integer call(){
        int result = 0;
        for(int i=1;i<=val;i++){
            result+= i;
        }
        return result;
    }
}
class SomeThread implements Runnable{
    @Override
    public void run() {
        System.out.println("From runnable type thread");
    }
}

