package org.launchcode.techjobs.oo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
 public void testSettingJobId() {
 Job test_job = new Job();
 Job test_job_2 = new Job();
 assertNotEquals(test_job.getId(),test_job_2.getId());
 }
 @Test
    public void testJobConstructorSetsAllFields() {
        Job testFields = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

     assertEquals("Product tester", testFields.getName());
     assertEquals("ACME", testFields.getEmployer().getValue());
     assertEquals("Desert", testFields.getLocation().getValue());
     assertEquals("Quality control", testFields.getPositionType().getValue());
     assertEquals("Persistence", testFields.getCoreCompetency().getValue());
     assertTrue(testFields instanceof Job);
     assertTrue(testFields.getEmployer() instanceof Employer);
     assertTrue(testFields.getLocation() instanceof Location);
     assertTrue(testFields.getPositionType() instanceof PositionType);
     assertTrue(testFields.getCoreCompetency() instanceof CoreCompetency);



 }

 @Test
    public void testJobsForEquality() {
     Job test_job = new Job("Product tester", new Employer("ACME"),
             new Location("Desert"), new PositionType("Quality control"),
             new CoreCompetency("Persistence"));
     Job test_job_2 = new Job("Product tester", new Employer("ACME"),
             new Location("Desert"), new PositionType("Quality control"),
             new CoreCompetency("Persistence"));

     assertNotEquals(test_job,test_job_2);
 }

}
