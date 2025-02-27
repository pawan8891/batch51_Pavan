package TestCases;

import org.testng.annotations.Test;

import driverInitializer.driverInitializer;
import reusableData.reusableData;

public class testCase1_CreateUser {

	@Test
	public static  void enterContactInformation()
	{
		driverInitializer.launchDriver(reusableData.url);
	}
	

}
