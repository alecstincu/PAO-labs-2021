package ro.unibuc.pao.exercise;

public class TestYourself6 {
    static int a;

    static {
        a = 4;
        System.out.println("inside static block");
        System.out.println("a = " + a);
    }

    TestYourself6() {
        System.out.println("inside constructor");
        a = 10;
    }

    public static void func() {
        a = a + 1;
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        TestYourself6 obj = new TestYourself6();
        obj.func();
    }
}

// inside static block
// a=4
// inside constructor
// a=11
