package week6.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG {

	@Test (priority = -1,invocationCount  = 5, threadPoolSize = 3 )
	 public void CreateLead() {
		  System.out.println("Lead created Successfully");
	  }
	@Test (priority = 5 )
	 public void DeleteLead() {
		  System.out.println("Lead Deleted Successfully");
	  }
	@Test (priority = 2)
	 public void DuplicateLead() {
		  System.out.println(" DublicateLead created Successfully");
	  }
	@Test (priority = 3)
	 public void EditLead() {
		  System.out.println("Lead Edited Successfully");
	  }
	@Test (enabled = false)
	 public void MergeLead() {
		  System.out.println("Lead Merged Successfully");
	  }
	
}
