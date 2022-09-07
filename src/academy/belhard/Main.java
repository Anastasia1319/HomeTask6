package academy.belhard;

import entity.Person;
import entity.User;

public class Main {
    public static void main(String[] args) {

        Person n1= new Person("Tom", "Hardy");
        System.out.println(n1.getFullName());


        User u1 = new User("Tom", "Hardy","tom.hardy@mail.ru", "13151719");
        System.out.println(u1.getFullInfo());
        System.out.println(u1.isPasswordCorrect("2826242220"));
    }
}