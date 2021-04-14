package ro.unibuc.pao.map;

import ro.unibuc.pao.Person;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<String, Person> personHashMap = new HashMap<>();
        Person p1 = new Person("Ioana", 18);

        personHashMap.put("2980506230078", new Person("Maria", 20));
        personHashMap.put("2960506230069", new Person("Alin", 30));
        personHashMap.put("2950506230063", new Person("Marius", 20));

        System.out.println(personHashMap.get("2980506230078"));

        // element cu aceeasi cheie
        personHashMap.put("2980506230078", p1);
        System.out.println(personHashMap.get("2980506230078"));

        personHashMap.remove("2960506230069");
        for (Map.Entry<String, Person> pair : personHashMap.entrySet()) {
            System.out.print("Key: " + pair.getKey() + "; value: " + pair.getValue() + "\n");
        }

        System.out.println("Keyset: ");
        System.out.println(personHashMap.keySet());

        System.out.println("Values: ");
        System.out.println(personHashMap.values());

        // mereu folositi obiecte imutabile pe post de chei
        Map<Person, Integer> map = new HashMap<>();
        Person p2 = new Person("Ioana", 18);
        map.put(p1, 2);
        map.put(p2, 3);
        System.out.println(map.get(p2));

        p2.setName("Another");
        System.out.println(map.get(p2));

        System.out.println(map);
    }
}
