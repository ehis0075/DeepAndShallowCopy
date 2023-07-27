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

        // Create a Person object
        Person originalPerson = new Person("Alice", 85, hobbies);

        // Clone the Person object
        Person clonedPerson = originalPerson.clone();

        // Check that the clonedPerson is not the same reference as the originalPerson (shallow copy)
        Assertions.assertNotSame(originalPerson, clonedPerson);

        // Check that the clonedPerson has the same values as the originalPerson (shallow copy)
        Assertions.assertEquals(originalPerson.getName(), clonedPerson.getName());
        Assertions.assertEquals(originalPerson.getScore(), clonedPerson.getScore());


        // Modify the hobbies list in the originalPerson
        originalPerson.getHobbies().add("Hiking");

        // Check that the hobbies list in the clonedPerson is not affected by the modification (deep copy)
        Assertions.assertNotEquals(originalPerson.getHobbies(), clonedPerson.getHobbies());
    }

}
