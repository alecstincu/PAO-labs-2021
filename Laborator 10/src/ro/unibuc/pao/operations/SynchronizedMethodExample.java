package ro.unibuc.pao.operations;

/**
 * Ne ajuta ca modificarile sa se faca sub excludere reciproca:
 * abia cand un thread termina executia, sa inceapa executarea celui de-al doilea fir.
 * Synchronized se poate utiliza si pe metode si pe blocuri.
 */
public class SynchronizedMethodExample implements Runnable {
    private Integer count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            increment();
        }
    }

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + "::" + count);
    }

    public static void main(String[] args) {
        SynchronizedMethodExample counter = new SynchronizedMethodExample();

        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);

        thread1.start();
        thread2.start();
    }
}

