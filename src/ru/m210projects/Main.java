package ru.m210projects;

import java.util.*;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        System.out.println(task6("ab", "abba"));
        System.out.println(task7("abc","bca"));
    }

    private static boolean task7(String s1, String s2) {
        return task6(s1, s2) && s1.length() == s2.length();
    }

    private static boolean task6(String s1, String s2) {
        Set<Character> set1 = new HashSet<Character>();
        for(char c : s1.toCharArray()) {
            set1.add(c);
        }

        Set<Character> set2 = new HashSet<Character>();
        for(char c : s2.toCharArray()) {
            set2.add(c);
        }

        return set1.equals(set2);
    }

    private static void task5() {
        List<Integer> nums = new ArrayList<>(List.of(3, 2, 2, 8, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> tmpList = new ArrayList<>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums) {
            if(!set.add(i))
                tmpList.add(i);
        }

        nums.replaceAll(t -> {
            if(tmpList.contains(t))
                return 0;

            return 1;
        });

        System.out.println(nums);
        nums.removeIf(e -> e == 0); // немного не сумма, но сумма нулей и единиц в листе будет равна длинне листа, заполненного 1
        System.out.println("List sum " + nums.size());
    }

    public static void task1() {
        System.out.println("=============================== Task1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(e -> (e % 2) == 0);
        System.out.println(nums);
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
