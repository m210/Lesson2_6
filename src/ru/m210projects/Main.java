package ru.m210projects;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("=============================== Task1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int i : nums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("=============================== End of task1");
    }

    public static void task2() {
        System.out.println("=============================== Task2");
        List<Integer> nums = new ArrayList<>(List.of(3, 1, 1, 2, 4, 4, 5, 5, 6, 7));
        nums.removeIf(e -> e % 2 != 0);
        Set<Integer> set = new HashSet<Integer>(nums);
        System.out.println(set);

        System.out.println("=============================== End of task2");
    }

    public static void task3() {
        System.out.println("=============================== Task3");
        List<String> list = new ArrayList<String>(List.of("Hello", "hello", "World", "Word", "Mother", "Father", "father"));
        list.replaceAll(e -> e.toLowerCase());
        Set<String> set = new HashSet<String>(list);

        System.out.println(set);

        System.out.println("=============================== End of task3");
    }

    public static void task4() {
        System.out.println("=============================== Task4");
        List<String> list = new ArrayList<String>(List.of("Hello", "Father", "hello", "World", "Mother", "Word", "Mother", "Father", "father"));
        list.replaceAll(e -> e.toLowerCase());
        Set<String> set = new HashSet<String>(list);

        System.out.println("Words to remove: " + (list.size() - set.size()));

        System.out.println("=============================== End of task4");
    }
}
