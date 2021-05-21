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
        assertTrue(test.toString() == "\nID: " + test.getId() + "\nName: Product tester\n" +
                "Employer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n\n");
    }

}
