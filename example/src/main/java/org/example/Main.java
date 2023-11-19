package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String name = "Artem";
        System.out.println(name.charAt(0)); //'A'

        Profile kevinProfile = new Profile("Kevin", "Smith", 2028, 4.0, "Science");

        Profile alexProfile = new Profile("Alex", "Domi", 2026, 3.5, "Engineering");

        kevinProfile.increaseExpectedYearOfGraduation();

        System.out.println(kevinProfile.expectedYearOfGraduation);

        System.out.println(alexProfile.expectedYearOfGraduation);
    }
}