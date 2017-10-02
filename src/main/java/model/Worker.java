package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String firstName;
    private String lastName;
    private int age;
    private boolean readyForTrip;
    private List<String> countries;

    public Worker(String firstName, String lastName, int age, boolean readyForTrip, List<String> countries) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.readyForTrip = readyForTrip;
        this.countries = countries;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isReadyForTrip() {
        return readyForTrip;
    }

    public void setReadyForTrip(boolean readyForTrip) {
        this.readyForTrip = readyForTrip;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public boolean canVisitCountry(String country){
        return countries.contains(country);
    }

    @Override
    public boolean equals(Object o) {
        return firstName == ((Worker)o).firstName &&
                lastName == ((Worker)o).lastName &&
                age == ((Worker)o).age &&
                readyForTrip == ((Worker)o).readyForTrip;
    }
}
