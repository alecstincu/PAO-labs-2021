package ro.unibuc.pao.exercise;

class MyTest {

    static {
        initialize();
    }
    // sum=4950

    private static int sum;

    public static int getSum() {
        initialize();
        return sum;
    }

    private static boolean initialized = false;
    // sum=4950; initialized=false

    private static void initialize() {
        if (!initialized) {
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            initialized = true;
        }
    }
}

class TestYourself2 {
    public static void main(String[] args) {
        System.out.println(MyTest.getSum());
        // sum = 9900; initialized = true
    }
}

