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

    Job job1, job2, job3, job4;

    @Before
    public void createJobObjects() {
        job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job4 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
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

        assertTrue("Product Tester".equals(job1.getName()));
        assertTrue("ACME".equals(job1.getEmployer().getValue()));
        assertTrue("Desert".equals(job1.getLocation().getValue()));
        assertTrue("Quality Control".equals(job1.getPositionType().getValue()));
        assertTrue("Persistence".equals(job1.getCoreCompetency().getValue()));
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job2.equals(job3));
    }


//@Test
//    public void testToStringContainsCorrectLabelsAndData() {
//this will encompass other tests
//}
//
//
//@Test
//    public void testToStringHandlesEmptyField() {
//// what if one of the fields is empty?
//    Job testJob = new Job("", "LaunchCode", "Location", "Snej", "webnxk", "wneind");
//    // ID: testJob.getId();
//    // Name:
//    // Epoyer: Launchcode
//    ... etc etc
//            Because the Name field is empty, it should return "Data not available" in that missing field
//
//    }


}
