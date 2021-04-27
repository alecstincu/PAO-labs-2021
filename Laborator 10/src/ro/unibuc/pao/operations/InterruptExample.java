package ro.unibuc.pao.operations;

import java.util.Scanner;

class MessageRunnable implements Runnable {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
//            System.out.println("Hello");
        }

    }
}

public class InterruptExample {
    public static void main(String[] args) {
        Thread helloThread = new Thread(new MessageRunnable());
        helloThread.setName("Runnable1");
        helloThread.start();

        Scanner in = new Scanner(System.in);
        int counter = 0;
        while (in.next().compareTo("stop") != 0) {
            counter++;
        }

        helloThread.interrupt();

        System.out.println("Stopped. Counter reached " + counter);
    }
}


