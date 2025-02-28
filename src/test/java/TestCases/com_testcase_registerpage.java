package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverInitializer.driverInitializer;
import readDataFromExcel.excelReader;
import readerUtils.readDataFromPropertiesFiles;
import reusableData.reusableData;

public class com_testcase_registerpage {

	
	@BeforeTest
	public void resgiterPage_Navigation()
	{
		driverInitializer.launchDriver(reusableData.url);
	}
	
	@Test
	public void enterContactInformation() throws IOException
	{
		driverInitializer.driver.findElement(By.xpath(readDataFromPropertiesFiles.readDataFromORProperties(reusableData.registerORPath,"Register.ContactInformation.FirstName.input"))).sendKeys(excelReader.readTestDataFromExcel(reusableData.excelDataPath,"ContactInformation", 1, 0));
		driverInitializer.driver.findElement(By.xpath(readDataFromPropertiesFiles.readDataFromORProperties(reusableData.registerORPath,"Register.ContactInformation.LastName.input"))).sendKeys(excelReader.readTestDataFromExcel(reusableData.excelDataPath,"ContactInformation", 1, 1));
		driverInitializer.driver.findElement(By.xpath(readDataFromPropertiesFiles.readDataFromORProperties(reusableData.registerORPath,"Register.ContactInformation.phone.input"))).sendKeys(excelReader.readTestDataFromExcel(reusableData.excelDataPath,"ContactInformation", 1, 2));
		driverInitializer.driver.findElement(By.xpath(readDataFromPropertiesFiles.readDataFromORProperties(reusableData.registerORPath,"Register.ContactInformation.userName.input"))).sendKeys(excelReader.readTestDataFromExcel(reusableData.excelDataPath,"ContactInformation", 1, 3));
		
	}

	
}
