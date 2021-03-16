package ro.unibuc.pao.interfete;

public class MyClass implements MyInterface, MyInterface2 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.saySomething();

        MyInterface.print(myClass.sayHello());
        MyInterface.print(myClass.sayBye());

        MyInterface myInterface = new MyClass();
        myInterface.sayHello();
        myInterface.saySomething();

        MyInterface2 myInterface2 = new MyClass();
        myInterface2.sayBye();

    }

    @Override
    public String sayHello() {
        return "Hello";
    }

    @Override
    public String sayBye() {
        return "Bye";
    }

    public void saySomething() {
        System.out.println("Say something from MyClass");
    }
}
