package ro.unibuc.pao.finals;

public class FinalLocalVar {

    public static void main(String[] args) {
        final int i; // local final variable
        i = 20;
//        i = 30; // re-assigning final variable will throw compile-time error

        System.out.println(i);
    }
}
