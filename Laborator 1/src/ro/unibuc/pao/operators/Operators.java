package ro.unibuc.pao.operators;

public class Operators {

    public static void main(String[] args) {
        boolean b1 = true == false; // ?
        boolean b2 = 3 > 10; // ?
        System.out.println(b1);
        System.out.println(b2);

        int x = 10;
        int y = 20;
        boolean b3 = y <= x; // ?
        System.out.println(b3);

        if (y / x < 5) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        System.out.println("1 + 2 = " + 1 + 2); // ?
        System.out.println("1 + 2 = " + (1 + 2)); // ?

        System.out.println(1 + 2 + "abc"); // ?
        System.out.println("abc" + 1 + 2); // ?

        int a = 10, b = 5, c = 1, result;
        result = a-++c-++b;
        System.out.println(result);
    }
}
