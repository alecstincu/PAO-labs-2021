package ro.unibuc.pao.abstractclass;

public class Derived extends MyAbstractClass {

    @Override
    public void test() {
        System.out.println("Hello from derived!");
    }

    @Override
    public void test2() {

    }

    public static void main(String[] args) {
        MyAbstractClass m1 = new Derived();
    }
}
