package org.examples.streamapi._1;

import org.junit.jupiter.api.Test;

import static org.examples.streamapi.TestUtil.PEOPLE;

public class ForEachTest {
    @Test
    void printOutNamesAllCaps_comments(){
        PEOPLE
                .forEach(
                      /*
                        To help you understand the lambda's syntax
                        You may start with this and use IntelliJ to simplify the expression.
                     */
                        (person) -> {
                            System.out.println(person.getName().toUpperCase());
                        }
                );
    }

    @Test
    void printOutAllCaps(){
        PEOPLE
                .forEach(p -> System.out.println(p.getName().toUpperCase()));
    }

    // Time for some practice: print out, in separate tests: lastName, age, Gender.

    @Test //lastName
    void printLastName(){
        PEOPLE
                .forEach(p -> System.out.println(p.getLastName()));
    }

    @Test //age
    void printAge(){
        PEOPLE
                .forEach(p -> System.out.println(p.getAge()));
    }

    @Test //gender
    void printGenfer(){
        PEOPLE
                .forEach(p -> System.out.println(p.getGender()));
    }

}
