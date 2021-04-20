package ro.unibuc.pao.streams;

import java.util.stream.Stream;

public class ExempluMatch {

    public static void main(String[] args) {
        Stream<String> seasons = Stream.of("summer", "winter", "autumn", "spring");

        boolean anyMatch = seasons.anyMatch(s -> s.contains("spring"));
        System.out.println(anyMatch);

        seasons = Stream.of("summer", "summer");
        boolean allMatch = seasons.allMatch(s -> s.contains("summer"));
        System.out.println(allMatch);

        seasons = Stream.of("summer", "winter", "autumn");
        boolean noneMatch = seasons.noneMatch(s -> s.contains("spring"));
        System.out.println(noneMatch);

    }
}
