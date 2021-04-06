package ro.unibuc.pao.exceptions;

class Test3 {
    int count = 0;

    void a() throws Exception {
        try {
            count++;

            try {
                count++;

                try {
                    count++;
                    throw new Exception();

                } catch (Exception ex) {
                    count++;
                    throw new Exception();
                }
            } catch (Exception ex) {
                count++;
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
        obj.display();
    }
}