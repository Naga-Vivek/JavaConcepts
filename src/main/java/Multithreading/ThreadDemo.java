package Multithreading;
class A implements Runnable{
    public void run(){
        synchronized (A.class){
            //this for obj level locking , .class for class level locking
            for(int i=1;i<=20;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
            try{
                Thread.sleep(300);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new A());
        Thread t3 = new Thread(new A());

        t1.setName("Sita");
        t2.setName("Geeta");
        t3.setName("Rita");

        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main Exit");

    }
}
