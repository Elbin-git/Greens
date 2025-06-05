package org.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exectution1 {
	@BeforeSuite
	private void methBSuite() {
		System.out.println("E1 Before Suite"+System.currentTimeMillis());
	}
	@AfterSuite
	private void methASuite() {
	System.out.println("E1 After Suite");
	}
	@BeforeTest
	private void methBTest() {
	   System.out.println("E1 Before Test"+System.currentTimeMillis());
	}
	@AfterTest
	private void methATest() {
		System.out.println("E1 After Test"+System.currentTimeMillis());
	}
	@BeforeClass
	private void methBClass() {
		System.out.println("E1 Before class"+System.currentTimeMillis());
		}
	@AfterClass
	private void methAClass() {
		System.out.println("E1 After class"+System.currentTimeMillis());
	}
	@BeforeMethod()
	private void methBMethod() {
		System.out.println("E1 Before Method"+System.currentTimeMillis());
	}
	asasasas
	@AfterMethod
	private void methAMethod() {
		System.out.println("E1 After Method"+System.currentTimeMillis());
	}
	@Test(priority=-3)
	private void meth3() {
		System.out.println("E1 Print : 3"+System.currentTimeMillis());
	}
	@Test(invocationCount=4)
	private void meth2() {
		System.out.println("E1 Print : 2"+System.currentTimeMillis());
	}
	@Test
	private void meth1() {
		System.out.println("E1 Print : 1"+System.currentTimeMillis());
	}
	}

		
	
	

	
	
	
	
	
	
	


