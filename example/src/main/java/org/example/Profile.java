package org.example;

public class Profile {
    String firstName;
    String lastName;
    int expectedYearOfGraduation;
    double GPA;
    String declaredMajor;

    public Profile(String firstName, String lastName, int expectedYearOfGraduation, double GPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearOfGraduation = expectedYearOfGraduation;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public void increaseExpectedYearOfGraduation() {
        expectedYearOfGraduation++;
    }
}
