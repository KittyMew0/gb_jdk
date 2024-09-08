package geekbrains_course.jdk.lesson3.seminar;

import geekbrains_course.jdk.lesson3.seminar.Pair;

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        System.out.println(pair1); 

        Pair<Double, Boolean> pair2 = new Pair<>(9.99, true);
        System.out.println(pair2); 

        System.out.println("First: " + pair1.getFirst());
        System.out.println("Second: " + pair1.getSecond()); 
    }
}
