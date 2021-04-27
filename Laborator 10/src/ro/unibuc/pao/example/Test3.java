package ro.unibuc.pao.example;

public class Test3 extends Thread implements Runnable {
    public void run() {
        System.out.println("GG");
    }

    public static void main(String[] args) throws InterruptedException {
        Test3 obj = new Test3();
        obj.start();
        obj.run();

        System.console().flush();
    }
}
