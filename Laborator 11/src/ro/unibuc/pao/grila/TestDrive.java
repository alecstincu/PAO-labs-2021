package ro.unibuc.pao.grila;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestDrive {
    public static void main(String[] args) {
        List<Automobil> automobilList = new ArrayList<>();

        Automobil automobil1 = new Automobil("Opel", "Astra", 1600, 5000);
        Automobil automobil2 = new Automobil("Audi", "A4", 1600, 10000);
        Automobil automobil3 = new Automobil("Toyota", "Corolla", 2200, 30000);
        Automobil automobil4 = new Automobil("Ford", "Puma", 1800, 14000);
        Automobil automobil5 = new Automobil("Toyota", "Prius", 1400, 20000);

        automobilList.add(automobil1);
        automobilList.add(automobil2);
        automobilList.add(automobil3);
        automobilList.add(automobil4);
        automobilList.add(automobil5);

        // automobile care costa cel putin 5000 ordonate descrescator pret
        Predicate<Automobil> predicate = automobil -> automobil.getPret() > 5000;
        Consumer<Automobil> consumer = (automobil) -> System.out.println(automobil);
        automobilList.stream()
                .filter(predicate)
                .sorted(Comparator.comparing(Automobil::getPret).reversed())
                .forEach(consumer);

        // marci distinte automobile
        List<String> marci = automobilList.stream()
                .map(automobil -> automobil.getMarca())
                .distinct()
                .collect(Collectors.toList());
        marci.forEach(System.out::println);

        // creati o lista cu automobilele cu capacitatea intre 2000 si 3000
        List<Automobil> newList = automobilList.stream()
                .filter(automobil -> automobil.getCapacitate() > 2000 && automobil.getCapacitate() < 3000)
                .collect(Collectors.toList());
        newList.forEach(System.out::println);

        // afisati pentru fiecare marca modelele existente
        Map<String, List<String>> map = automobilList.stream()
                .collect(Collectors.groupingBy(Automobil::getMarca, Collectors.mapping(Automobil::getModel, Collectors.toList())));
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Pentru marca: " + entry.getKey() + " avem modelele: " + entry.getValue());
        }

    }
}
