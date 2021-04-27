package ro.unibuc.pao.example;

public class Test2 implements Runnable {
    public void run() {
        System.out.print("Hello thread");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Test2());
        thread1.start();
        thread1.start(); // invoking start on an already RUNNING thread throws exception
        System.out.println("End main");
    }
}
