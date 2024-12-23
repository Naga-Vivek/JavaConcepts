package Multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new IncThread("Rajesh",sem);
        new DecThread("Dinesh",sem);
        new IncThread("Suresh",sem);
        new IncThread("Brijesh",sem);
        new DecThread("Mahesh",sem);
        new IncThread("Ganesh",sem);
        new DecThread("Rakesh",sem);
        new DecThread("Jitesh",sem);
    }
}
class Shared{
    public static int count =0;
}
class IncThread implements  Runnable{
    String name;
    Semaphore sem;
    public IncThread(String n,Semaphore s){
        name = n;
        sem = s;
        new Thread(this).start();
    }
    public void run(){
        try{
            System.out.println(name+" is waiting for permission");
            sem.acquire();
            System.out.println(name+" has got the permission");
            for(int i=1;i<=5;i++){
                System.out.println(name+" : "+ ++Shared.count);
                Thread.sleep(2000);
            }
            System.out.println(name+" has released the permission :) ");
            sem.release();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class DecThread implements  Runnable{
    String name;
    Semaphore sem;
    public DecThread(String n,Semaphore s){
        name = n;
        sem = s;
        new Thread(this).start();
    }
    public  void run(){
        try{
            System.out.println(name+" is waiting for permission");
            sem.acquire();
            System.out.println(name+" has got the permission");
            for(int i=1;i<=5;i++){
                System.out.println(name+" : "+ --Shared.count);
                Thread.sleep(2000);
            }
            System.out.println(name+" has released the permission :) ");
            sem.release();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
