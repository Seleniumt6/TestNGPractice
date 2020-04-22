package practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	@Test(priority=1)
	public void gmailRegistration() {
		System.out.println("Do user registration");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Do user registration");
	}
	@BeforeTest
	public void openBrowser() {
		System.out.println("Do user registration");
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("Do user registration");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("Do user registration");
	}

}
