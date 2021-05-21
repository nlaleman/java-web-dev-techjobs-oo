package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.launchcode.techjobs_oo.*;
import org.junit.*;

import static org.junit.Assert.*;

public class JobTest {

//   @Before
//   Job test_job1 = new Job();
//   Job test_job2 = new Job();

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

}
