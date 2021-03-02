package ro.unibuc.pao.exercise;

public class TestYourself1 {

    public static void main(String[] args) {
        new TestYourself1();
        new TestYourself1(8);
    }

    TestYourself1(int x) {
        System.out.println("ONE argument constructor");
    }

    TestYourself1() {
        System.out.println("No  argument constructor");
    }

    static {
        System.out.println("1st static init");
    }

    {
        System.out.println("1st instance init");
    }

    {
        System.out.println("2nd instance init");
    }

    static {
        System.out.println("2nd static init");
    }
}
// 1st static init
// 2nd static
// 1st instance
// 2nd instance
// no arg
// 1st instance
// 2nd instance
// one arg
