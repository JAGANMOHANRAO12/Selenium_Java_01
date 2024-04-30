package day2_test_01;

import org.testng.annotations.Test;

public class Test_regression_groups_2 {
	@Test(groups= {"start"})
	public void carstart() {
		System.out.println("car is starting");	
		}
	@Test(groups= {"start"})
	public void vanstart() {
		System.out.println("van is starting");
	}
	@Test(groups= {"engine"})
	public void cardriving() {
		System.out.println("car is on the way");
	}
	@Test(groups= {"engine"})
	public void vandrivng() {
		System.out.println("van is on the way");
	}
	@Test(groups= {"stop"})
	public void carstop() {
		System.out.println("car is stopping");
	}
	@Test(groups= {"stop"})
	public void vanstop() {
		System.out.println("van is stopping");
	}
}
