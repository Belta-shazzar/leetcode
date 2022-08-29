package com.shazzar.leetcode.oracletutorial;

import java.util.List;
import java.util.function.Predicate;

import static com.shazzar.leetcode.oracletutorial.Person.Sex.*;

public class Operation {

    static List<Person> people = List.of(
            new Person("Sam", 20, MALE, "sam@gmail.com"),
            new Person("Joe", 18, FEMALE, "joe@gmail.com"),
            new Person("Moe", 25, FEMALE, "moe@gmail.com"),
            new Person("Rowe", 16, MALE, "rowe@gmail.com"),
            new Person("Jim", 12, MALE, "jim@gmail.com"),
            new Person("Dan", 23, FEMALE, "dan@gmail.com")
    );


//    Local pattern
    public static void printPersonsOlderThan(List<Person> roaster, int age) {
        for (Person person : roaster) {
            if (person.getAge() >= age) {
                System.out.println(person);
            }
        }
    }

//    Anonymous
    public static void printPerson(List<Person> roaster, CheckPerson tester) {
        for (Person person : roaster) {
            if (tester.test(person)) {
                System.out.println(person);
            }
        }
    }

    public static void printPerson(List<Person> roaster, Predicate<Person> tester) {
        for (Person person : roaster) {
            if (tester.test(person)) {
                System.out.println(person);
            }
        }
    }

    public static void main(String[] args) {
//        Method one. Local
//        printPersonsOlderThan(people, 18);

//        Method two. Implementing interface
//        printPerson(people, new CheckPersonEligibleForSelectiveService());

//        Anonymous class
        printPerson(people, new CheckPerson() {
            @Override
            public boolean test(Person person) {
                return person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25;
            }
        });


//        Lambda expression
        printPerson(people, (CheckPerson) person -> person.getGender() == MALE
                && person.getAge() >= 18
                && person.getAge() <= 25);

        printPerson(people, (Predicate<Person>) person -> person.getGender() == MALE
                && person.getAge() >= 18
                && person.getAge() <= 25);



    }
}
