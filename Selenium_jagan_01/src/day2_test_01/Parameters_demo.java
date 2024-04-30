package day2_test_01;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_demo {
	@Test
	@Parameters({"val1","val2"})
	public void add(int v1,int v2) {
		int sum=v1+v2;
		System.out.println("sum is:"+sum);
	}

}
