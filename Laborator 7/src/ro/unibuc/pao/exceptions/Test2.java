package ro.unibuc.pao.exceptions;

class Test2 {
    String str = "a";

    void a() {
        try {
            str += "b";
            b();
        } catch (Exception e) {
            str += "c";
        }
    }

    void b() throws Exception {
        try {
            str += "d";
            c();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            str += "e";
        }

        str += "f";

    }

    void c() throws Exception {
        throw new Exception();
    }

    void display() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test2 object = new Test2();
        object.a();
        object.display();
    }

}
