package practice;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class TestCase2 implements ITestListener{
	
	
	@Test
	public void validateTitle() {
		
		String webTitle = "Amazon";
		String xltitle = "Google";
		/*
		 * if(webTitle.equalsIgnoreCase(xltitle)) {
		 * System.out.println("Test case Passed"); }else {
		 * System.out.println("Test Case Failed"); }
		 *
		*;;
		 */
		Assert.assertEquals(webTitle, xltitle);
		
		
	}
	
	
	
}
