package ro.unibuc.pao.example;

class Fir implements Runnable {
    int x;

    public Fir(int x) {
        this.x = x;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.print(x);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Fir obj1 = new Fir(1);
        Fir obj2 = new Fir(2);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t2.join();

        System.out.print(3);
    }
}
