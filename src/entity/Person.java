package entity;

public class Person {
    protected String firstName;
    protected String lastName;

    public void personalData (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}