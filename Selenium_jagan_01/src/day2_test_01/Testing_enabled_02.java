package day2_test_01;

import org.testng.annotations.Test;

public class Testing_enabled_02 {
	
	@Test
	public void test() {
		System.out.println("this is test0");
	}
	
	@Test(priority=0,invocationCount=3)
	public void test1() {
		System.out.println("this is test1");
	}
	
	@Test(priority=1)
	public void test2() {
		System.out.println("this is test2");
	}
	
	@Test(priority=2,enabled=false)
	public void test3() {
		System.out.println("this is test3");
	}
	
	@Test
	public void test4() {
		System.out.println("this is test4");
	}

}
