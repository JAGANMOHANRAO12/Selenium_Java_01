package day2_test_01;

import org.testng.annotations.Test;

public class Test_regression_smoke {
	@Test(groups= {"Smoke"})
	public void test() {
		System.out.println("test1");
	}
	@Test(groups= {"Smoke","Sanity"})
	public void test1() {
		System.out.println("test2");
	}
	@Test(groups= {"Smoke"})
	public void test2() {
		System.out.println("test3");
	}
	@Test(groups= {"Regression"})
	public void test3() {
		System.out.println("test4");
	}
	@Test(groups= {"Smoke","Sanity"})
	public void test4() {
		System.out.println("test4");
	}
	@Test(groups= {"Sanity"})
	public void test5() {
		System.out.println("test5");
	}
}
