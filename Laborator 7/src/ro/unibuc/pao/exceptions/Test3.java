package ro.unibuc.pao.exceptions;

class Test3 {
    int count = 0;

    void a() throws Exception {
        try {
            count++; //1

            try {
                count++; //2

                try {
                    count++; //3
                    throw new Exception();

                } catch (Exception ex) {
                    count++; //4
                    throw new Exception();
                }
            } catch (Exception ex) {
                count++; //5
            }
        } catch (Exception ex) {
            count++;
        }

    }

    void display() {
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception {
        Test3 obj = new Test3();
        obj.a();
        obj.display(); // 5
    }
}