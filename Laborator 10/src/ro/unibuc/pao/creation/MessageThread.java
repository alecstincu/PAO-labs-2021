package ro.unibuc.pao.creation;

/**
 * Putem crea un Thread prin extinderea clasei Thread.
 *
 * Threadul porneste odata apelata metoda start. Aceasta invoca metoda run, iar pe langa asta
 * creaza si contextul necesar unui nou fir de executie (stiva proprie, set registrii).
 */
public class MessageThread extends Thread {

    /**
     * Suprascriere metoda run. In cadrul ei punem secventa de cod pe care dorim sa o executam.
     */
    @Override
    public void run() {
        System.out.println("Hello from thread!");
    }

    public static void main(String[] args) {
        System.out.println("Begin main");

        MessageThread helloThread = new MessageThread();
        helloThread.setName("Thread-test");

        // see difference in debug
        helloThread.start();
//        helloThread.run();

        System.out.println("End main");
    }
}
