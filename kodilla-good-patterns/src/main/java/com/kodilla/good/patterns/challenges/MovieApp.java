package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class MovieApp {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> allMovies = movieStore.getMovies();
        allMovies.entrySet().stream()
                .flatMap(l -> l.getValue().stream())
                .forEach(s -> System.out.println(s + "!"));
    }
}
