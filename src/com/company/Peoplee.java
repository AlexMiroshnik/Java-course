package com.company;

public class Peoplee {
    private String firstName;
    private String lastName;
    private int birthYear;
    public static int year = 2020;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String changeName( String firstName){
        this.firstName = firstName;
        return getFirstName();
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    public int getAge() {
        return 2020 - getBirthYear();

    }


    public Peoplee() {

    }

    public Peoplee (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Peoplee (String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Peoplee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}


