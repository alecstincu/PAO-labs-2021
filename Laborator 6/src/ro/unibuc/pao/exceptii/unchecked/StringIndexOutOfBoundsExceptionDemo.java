package ro.unibuc.pao.exceptii.unchecked;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        String a = "This is like chipping "; // length is 22
        char c = a.charAt(24);

        System.out.println(c);
    }
}
