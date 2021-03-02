package ro.unibuc.pao.exercise;

class Test {
    int t = 20;

    Test() {
        t = 40;
    }
}

class TestYourself3 {
    public static void main(String[] args) {
        Test test1 = new Test();
        System.out.println(test1.t);
    }
}
