package ro.unibuc.pao.singleton;

// Pros: Instance can be accessed directly.
// Cons: may lead to resource wastage. Because instance of class is created always, whether it is required or not.
public class Singleton3 {

    public static Singleton3 instance;

    // private constructor
    private Singleton3() {
    }

    static {
        // static block to initialize instance
        instance = new Singleton3();
    }
}

class Main3 {
    public static void main(String[] args) {
        Singleton3 x = Singleton3.instance;
        Singleton3 y = Singleton3.instance;

        System.out.println(x == y);
    }
}
