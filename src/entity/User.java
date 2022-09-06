package entity;

public class User extends Person {
    private String email;
    private String password;

    public void fullInfo (String firstName, String lastName, String email, String password) {
        super.personalData(firstName,lastName);
        this.email = email;
        this.password = password;
    }

    public  String getFullInfo() {
        return "Èìÿ: " + getFullName() + "\n" + "E-mail: " + email;
    }

    public boolean  isPasswordCorrect (String password) {
        return this.password.equals(password);
    }
}