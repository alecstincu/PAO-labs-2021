package ro.unibuc.pao.classes;

public class Bird extends Animal {

    int noOfLegs = 2;

    public Bird(String sound) {
        super(sound);
    }

    // good practice to add this annotation to highlight method is overridden
    @Override
    public void printName() {
        System.out.println("Birds have no name!");
    }

    @Override
    public void move() {
        System.out.println("I can fly!");
    }

    public int getNoOfLegsFromParent() {
        return super.getNoOfLegs();
    }

    // generate equals and hashcode and play in VisitToFarm; use Alt+Insert-> equals and hashcode -> template java.util.Objects
}
