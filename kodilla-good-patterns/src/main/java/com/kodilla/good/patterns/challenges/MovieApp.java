package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieApp {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> allMovies = movieStore.getMovies();
        String titles = allMovies.entrySet().stream()
                .flatMap(l -> l.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(titles);
    }
}
