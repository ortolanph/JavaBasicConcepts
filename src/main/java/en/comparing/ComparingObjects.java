package en.comparing;

import en.entitties.Person;

import java.time.LocalDate;
import java.time.Month;

public class ComparingObjects {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setId(1);
        person1.setName("James Arthur Gosling");
        person1.setBirthDay(LocalDate.of(1955, Month.MAY, 19));
        person1.setMobile("404-555-0182");
        person1.setPhone("515-555-0151");

        Person person2 = new Person();

        person2.setId(1);
        person2.setName("James Arthur Gosling");
        person2.setBirthDay(LocalDate.of(1955, Month.MAY, 19));
        person2.setMobile("404-555-0182");
        person2.setPhone("515-555-0151");

        if(person1 == person2) {
            System.out.println("Same person!");
        } else {
            System.out.println("Different people!");
        }

        if(person1.equals(person2)) {
            System.out.println("Same person!");
        } else {
            System.out.println("Different people!");
        }
    }

}
