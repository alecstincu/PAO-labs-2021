package ro.unibuc.pao.example;


public class Test1 implements Runnable {
    public void run() {
        System.out.print("Hello ");
        System.out.print("world! \n");
    }

    public static void main(String[] args) throws InterruptedException {
        Test1 obj = new Test1();
        Thread thread = new Thread(obj);

        System.out.println("Before try");

        thread.start();
        Thread.sleep(200);

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End main");
    }
}
