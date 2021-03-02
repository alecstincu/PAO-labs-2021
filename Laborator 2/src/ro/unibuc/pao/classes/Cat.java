package ro.unibuc.pao.classes;

import java.util.Objects;

public class Cat extends Animal {

    private CatBreed catBreed;

    public Cat(String name, String sound, CatBreed catBreed) {
        super(name, sound);
        this.catBreed = catBreed;
    }

    public CatBreed getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(CatBreed catBreed) {
        this.catBreed = catBreed;
    }

    // generate equals and hashcode and toString and play in VisitToFarm; use Alt+Insert-> equals and hashcode -> template java.util.Objects
}
