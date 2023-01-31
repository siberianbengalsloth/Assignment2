package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job job1, job2, job3, job4, job5, job6;

    @Before
    public void createJobObjects() {
        job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job4 = new Job("Ice Cream Tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting Ability"));
        job5 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        job6 = new Job();
    }


    @Test
    public void emptyTest() {
        assertEquals(2, 2);
    }

    @Test
    public void testSettingJobId() {
        Job ex1 = new Job();
        Job ex2 = new Job();
        assertNotEquals(ex1.getId(), ex2.getId());
        // make sure they don't have the same ID
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        // refer to the chapter 6 lecture file. no need to use instanceof to test that the fields in your job object have the correct types
        // just need to test that the fields are getting set to what you expect them to be

        assertEquals("Product Tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality Control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job2.equals(job3));
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String expectedOutput = "ID: " + job1.getId() + '\n' +
                "Name: Product Tester" + '\n' +
                "Employer: ACME" + '\n' +
                "Location: Desert" + '\n' +
                "Position Type: Quality Control" + '\n' +
                "Core Competency: Persistence" + '\n';

        String actualOutput = job1.toString();

        assertEquals(expectedOutput, actualOutput);

    }


    @Test
    public void testToStringHandlesEmptyField() {
        String expectedOutput = "ID: " + job4.getId() + '\n' +
                "Name: Ice Cream Tester" + '\n' +
                "Employer: Data not available" + '\n' +
                "Location: Home" + '\n' +
                "Position Type: UX" + '\n' +
                "Core Competency: Tasting Ability" + '\n';

        String actualOutput = job4.toString();

        assertEquals(expectedOutput, actualOutput);

    }

}
