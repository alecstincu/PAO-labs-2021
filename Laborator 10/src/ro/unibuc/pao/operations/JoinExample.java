package ro.unibuc.pao.operations;

/**
 * Join suspenda executarea firului parinte pana la terminarea firului curent.
 */
public class JoinExample extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from thread " + Thread.currentThread().getName() + "!");
    }

    public static void main(String[] args) {
        System.out.println("Begin main");

        JoinExample t1 = new JoinExample();
        t1.setName("T1");
        JoinExample t2 = new JoinExample();
        t2.setName("T2");

        t1.start();
        t2.start(); // see what happens

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        t2.start();
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("End main");
    }
}
