package TestCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverInitializer.driverInitializer;
import readerUtils.readDataFromPropertiesFiles;
import reusableData.reusableData;

public class com_testcase_registerpage {

	
	@BeforeTest
	public void resgiterPage_Navigation()
	{
		driverInitializer.launchDriver(reusableData.url);
	}
	
	@Test
	public void enterContactInformation() throws FileNotFoundException
	{
		driverInitializer.driver.findElement(By.xpath(readDataFromPropertiesFiles.readDataFromORProperties(reusableData.registerORPath,"Register.ContactInformation.FirstName.input"))).sendKeys("Pavan");
		driverInitializer.driver.findElement(By.xpath(readDataFromPropertiesFiles.readDataFromORProperties(reusableData.registerORPath,"Register.ContactInformation.LastName.input"))).sendKeys("Goswami");
		
	}

	
}
