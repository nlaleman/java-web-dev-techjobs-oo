package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

   @Test
   public void testSettingJobId() {
       Job test_job1 = new Job();
       Job test_job2 = new Job();
       assertTrue(test_job1.getId() != test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test.getName() == "Product tester");
        assertTrue(test.getEmployer().getValue() == "ACME");
        assertTrue(test.getLocation().getValue() == "Desert");
        assertTrue(test.getPositionType().getValue() == "Quality control");
        assertTrue(test.getCoreCompetency().getValue() == "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test1.equals(test2));
    }

    @Test
    public void testJobToString(){
        Job test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test.toString(), "\nID: " + test.getId() + "\nName: Product tester\n" +
                        "Employer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n\n");
        Job testA = new Job("", new Employer ("Test Employer"), new Location("Test Location"), new PositionType("Test Position Type"), new CoreCompetency("Test Core Competency"));
        assertEquals(testA.toString(), "\nID: " + testA.getId() + "\nName: Data not available\n" +
                "Employer: Test Employer\nLocation: Test Location\nPosition Type: Test Position Type\nCore Competency: Test Core Competency\n\n");
        Job testB = new Job("Test Name", new Employer (""), new Location("Test Location"), new PositionType("Test Position Type"), new CoreCompetency("Test Core Competency"));
        assertEquals(testB.toString(), "\nID: " + testB.getId() + "\nName: Test Name\n" +
                "Employer: Data not available\nLocation: Test Location\nPosition Type: Test Position Type\nCore Competency: Test Core Competency\n\n");
        Job testC = new Job("Test Name", new Employer ("Test Employer"), new Location(""), new PositionType("Test Position Type"), new CoreCompetency("Test Core Competency"));
        assertEquals(testC.toString(), "\nID: " + testC.getId() + "\nName: Test Name\n" +
                "Employer: Test Employer\nLocation: Data not available\nPosition Type: Test Position Type\nCore Competency: Test Core Competency\n\n");
        Job testD = new Job("Test Name", new Employer ("Test Employer"), new Location("Test Location"), new PositionType(""), new CoreCompetency("Test Core Competency"));
        assertEquals(testD.toString(), "\nID: " + testD.getId() + "\nName: Test Name\n" +
                "Employer: Test Employer\nLocation: Test Location\nPosition Type: Data not available\nCore Competency: Test Core Competency\n\n");
        Job testE = new Job("Test Name", new Employer ("Test Employer"), new Location("Test Location"), new PositionType("Test Position Type"), new CoreCompetency(""));
        assertEquals(testE.toString(), "\nID: " + testE.getId() + "\nName: Test Name\n" +
                "Employer: Test Employer\nLocation: Test Location\nPosition Type: Test Position Type\nCore Competency: Data not available\n\n");
        Job testF = new Job("", new Employer (""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals(testF.toString(), "OOPS! This job does not seem to exist.");
    }

}
