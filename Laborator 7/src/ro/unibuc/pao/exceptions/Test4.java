package ro.unibuc.pao.exceptions;

class Test4 {

    public static void main(String[] args) {
        try {
            try {
                try {
                    int[] arr = {1, 2, 3, 4};
                    System.out.println(arr[10]);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" try-block1");
                }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println(" try-block2");
            }
        } catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" main try-block");
        } catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}