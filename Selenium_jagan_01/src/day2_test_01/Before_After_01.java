package day2_test_01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After_01 {
	
	@BeforeMethod
	public void p1() {
		System.out.println("1"); 
	}
	
	@Test
	public void p2() {
		System.out.println("2");
	}
	
	@AfterMethod
	public void p3() {
		System.out.println("3");
	}
}
