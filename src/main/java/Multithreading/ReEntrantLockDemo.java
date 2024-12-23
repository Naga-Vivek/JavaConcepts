package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock rl = new ReentrantLock();
        new MyThread(rl,"Surekha");
        new MyThread(rl,"Rekha");
        new MyThread(rl,"Anita");
        new MyThread(rl,"Sunita");
        new MyThread(rl,"Babita");
    }
}
class MyShared{
    public static AtomicInteger count = new AtomicInteger(0);
}
class MyThread implements Runnable{
    String name;
    ReentrantLock lock;
    MyThread(ReentrantLock l, String n){
        name = n;
        lock = l;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Starting....."+name);
        System.out.println(name+" is waiting to lock the count variable");
        lock.lock();
        System.out.println(name+" has locked the count variable");
        lock.lock();
        MyShared.count.incrementAndGet();
        System.out.println(name+" : "+Shared.count);
        System.out.println(name+" is releasing the count variable");
        System.out.println("Finished....."+name);
        lock.unlock();
        lock.unlock();
    }
}
