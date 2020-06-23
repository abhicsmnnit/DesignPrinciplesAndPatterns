package com.example.patterns.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategyDemo {
    public static void main(String[] args) {
        List<Leader> leaders = getLeaders();

        System.out.println("Strategy 1 in action!");
        System.out.println("By First Name");
        leaders.sort(byFirstName());
        leaders.forEach(System.out::println);
        System.out.println();

        System.out.println("Strategy 2 in action!");
        System.out.println("By Last Name");
        leaders.sort(byLastName());
        leaders.forEach(System.out::println);
        System.out.println();

        System.out.println("Strategy 3 in action!");
        System.out.println("By Status");
        leaders.sort(byStatus());
        leaders.forEach(System.out::println);
    }

    // Strategy 1
    private static Comparator<Leader> byFirstName() {
        return Comparator.comparing(Leader::getFirstName);
    }

    // Strategy 2
    private static Comparator<Leader> byLastName() {
        return Comparator.comparing(Leader::getLastName);
    }

    // Strategy 3
    private static Comparator<Leader> byStatus() {
        return Comparator.comparing(Leader::isPresident).reversed();
    }

    private static List<Leader> getLeaders() {
        return new ArrayList<>(List.of(
                new Leader("Narendra", "Modi", false),
                new Leader("Rahul", "Gandhi", false),
                new Leader("Ramnath", "Kovind", true),
                new Leader("Amit", "Shah", false)));
    }
}
