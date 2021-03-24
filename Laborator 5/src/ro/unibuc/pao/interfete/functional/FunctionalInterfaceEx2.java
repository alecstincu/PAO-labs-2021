package ro.unibuc.pao.interfete.functional;

public interface FunctionalInterfaceEx2 {

    void execute();

    void execute2();

    default void print(String text) {
        System.out.println(text);
    }

    static void print(String text, String name) {
        System.out.println(name + ": " + text);
    }
}
