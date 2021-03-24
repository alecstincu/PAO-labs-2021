package ro.unibuc.pao.interfete.functional;

public class Main {

    public static void main(String[] args) {
        FunctionalInterfaceEx1 functionalInterface = new FunctionalInterfaceEx1() {
            @Override
            public void execute() {
                System.out.println("Executing...");
            }
        };

        FunctionalInterfaceEx1 functionalInterfaceExemplul1 = () -> {
            System.out.println("Executing...");
        };

        FunctionalInterfaceEx1 functionalInterfaceEx1_1 = new Test();

        functionalInterfaceExemplul1.execute();
        functionalInterface.execute();
        functionalInterfaceEx1_1.execute();

//        FunctionalInterfaceEx2 functionalInterfaceEx2 = () -> {
//            System.out.println("Executing...");
//        };

    }
}
