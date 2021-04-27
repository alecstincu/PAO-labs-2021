package ro.unibuc.pao.creation;

/**
 * Putem crea un Thread prin implementarea interfetei Runnable.
 *
 * Threadul porneste odata apelata metoda start. Aceasta invoca metoda run, iar pe langa asta
 * creaza si contextul necesar unui nou fir de executie (stiva proprie, set registrii).
 */
public class MessageRunnable implements Runnable {

    /**
     * Suprascriere metoda run. In cadrul ei punem secventa de cod pe care dorim sa o executam.
     */
    @Override
    public void run() {
        System.out.println("Hello from another thread!");
    }

    public static void main(String[] args) {
        Thread helloThread = new Thread(new MessageRunnable());
//        helloThread.setName("Runnable-test");
        helloThread.start();
        System.out.println("End main!");
    }
}
