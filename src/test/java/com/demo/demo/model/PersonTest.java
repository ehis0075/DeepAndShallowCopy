package com.demo.demo.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {


    @Test
    public void testClone() {

        // Create a list of hobbies
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Swimming");

        //1 Create a Person object
        Person originalPerson = new Person("Alice", 85, hobbies);

        //2 Clone the Person object
        Person clonedPerson = originalPerson.clone();

        //3 Check that the clonedPerson is not the same reference as the originalPerson (shallow copy)
        Assertions.assertNotSame(originalPerson, clonedPerson);

        //4 Check that the clonedPerson has the same values as the originalPerson (shallow copy)
        Assertions.assertEquals(originalPerson.getName(), clonedPerson.getName());
        Assertions.assertEquals(originalPerson.getScore(), clonedPerson.getScore());


        //5 Modify the hobbies list in the originalPerson
        originalPerson.getHobbies().add("Hiking");

        //6 Check that the hobbies list in the clonedPerson is not affected by the modification (deep copy)
        Assertions.assertNotEquals(originalPerson.getHobbies(), clonedPerson.getHobbies());
    }

}
