package ro.unibuc.pao.exceptions;

class Base extends Exception {
}

class Derived extends Base {
}

public class Test1 {
    public static void main(String[] args) {
        try {
            throw new Derived();
        }
        catch (Derived d) {
            System.out.println("Caught derived class exception");
        }
        catch (Base b) {
            System.out.println("Caught base class exception");
        }
    }
}
