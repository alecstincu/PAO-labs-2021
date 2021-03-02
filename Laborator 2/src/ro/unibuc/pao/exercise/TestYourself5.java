package ro.unibuc.pao.exercise;

final class TestYourself5 {
    private final double re;
    private final double im;

    public TestYourself5(double re, double im) {
        this.re = re;
        this.im = im;
    }

    TestYourself5(TestYourself5 t) {
        System.out.println("Copy constructor called");
        re = t.re;
        im = t.im;
    }

    @Override
    public String toString() {
        return "TestYourself5{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        TestYourself5 t1 = new TestYourself5(10, 15);
        TestYourself5 t2 = new TestYourself5(t1);

        System.out.println(t2);
    }
}
