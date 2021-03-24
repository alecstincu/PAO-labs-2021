package ro.unibuc.pao.interfete;

// what will happen when: implements MyInterface1, MyInterface2 ?
public class MyClass implements MyInterface2 {

    @Override
    public int firstSignature() {
        return 0;
    }

    @Override
    public int secondSignature(int i) {
        return 0;
    }
}
