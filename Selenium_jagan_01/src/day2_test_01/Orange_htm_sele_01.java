package day2_test_01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Orange_htm_sele_01 {
	@Test(dataProvider="dataSet")
	public void login(String user,String pass) {
		
	}
	@DataProvider(name="dataSet")
	public void dataMethod(){
		Object[][] obj=new Object[2][2];
		obj[0][0]="Admin";
		obj[0][1]="amin123";
		obj[1][0]="HrAdmin";
		obj[1][1]="hr123";
		
	}
}
