package ro.unibuc.pao.classes.constructors;

class Base {
    Base() {
        System.out.println("Base Class Constructor Called ");
    }
}

// use extends in order to inherit from another class
class Derived extends Base {
    // default constructor is also generated by the compiler
    Derived() {
        System.out.println("Derived Class Constructor Called ");
    }
}

public class PlayWithConstructor1 {
    public static void main(String[] args) {
        // creare obiect si asignare referinta in heap
        Derived d = new Derived();
    }
}