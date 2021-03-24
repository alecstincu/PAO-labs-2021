package ro.unibuc.pao.generice;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    protected String name = "Pizza";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}

class HamPizza extends Pizza {
    public HamPizza() {
        name = "HamPizza";
    }
}

class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "CheesePizza";
    }
}

class BoundedTypesTest {
    // Aici folosim "bounded types", accepta doar instante de Pizza sau copii ai clasei Pizza
    // Folosim upper bounds in general cand vrem sa parcurgem fara sa modificam o colectie: List<? extends Pizza> upperBoundPizzaList = new ArrayList<>();
    public static <T extends Pizza> void listPizza(T[] pizzaArray) {
        System.out.println("We have different types of pizza");
        for (T t : pizzaArray) {
            System.out.println(t.getName());
        }
    }

    public static void main(String[] args) {
        BoundedTypesTest.listPizza(new Pizza[]{new HamPizza(), new CheesePizza(), new Pizza()});
        // Se va afişa: "HamPizza", "CheesePizza", "Pizza"

        // folosim lower bound in general cand vrem sa modificam o colectie
        List<? super HamPizza> lowerBoundPizzaList = new ArrayList<>();
        lowerBoundPizzaList.add(new HamPizza());
        System.out.println(lowerBoundPizzaList.toString());
    }
}
