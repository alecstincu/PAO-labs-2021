package ro.unibuc.pao.exceptii.unchecked;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        int num = Integer.parseInt("string");

        System.out.println(num);
    }
}
