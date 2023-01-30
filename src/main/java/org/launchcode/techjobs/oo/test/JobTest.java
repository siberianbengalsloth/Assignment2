package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void emptyTest() {
    assertEquals(2, 2);
    }

    @Test
    public void testSettingJobId() {
        Job ex1 = new Job();
        Job ex2 = new Job();
        assertNotEquals();
        // make sure they don't have the same ID
    }

    @Test
    public void testJobConstructorSetsAllFields() {
    // refer to the chapter 6 lecture file. no need to use instanceof to test that the fields in your job object have the correct types
    // just need to test that the fields are getting set to what you expect them to be

    }

@Test
    testJobsForEquality
    assertNotEquals


@Test
    public void testToStringContainsCorrectLabelsAndData() {
this will encompass other tests
}


@Test
    public void testToStringHandlesEmptyField() {
// what if one of the fields is empty?
    Job testJob = new Job("", "LaunchCode", "Location", "Snej", "webnxk", "wneind");
    // ID: testJob.getId();
    // Name:
    // Epoyer: Launchcode
    ... etc etc
            Because the Name field is empty, it should return "Data not available" in that missing field

    }





}
