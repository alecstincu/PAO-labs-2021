package ro.unibuc.pao.interfete;

public interface MyInterface {
    // variable declaration
    public static final String HELLO = "hello"; // best practice is write constants with uppercase letters, separated by _, if multiple words

    public String sayHello();

    // Since Java 8 we can have default methods, with default implementation for that method
    // Classes that implement the interface but have no implementation will automatically get the default one
    default void saySomething() {
        System.out.println("Something");
    }

    // static methods in an interface must have implementation
    // they dont depend on the need to create object, can be referred by the class name itself
    public static void print(String message) {
        System.out.println(message);
    }
}
