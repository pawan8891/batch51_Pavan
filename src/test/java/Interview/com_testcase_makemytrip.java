package Interview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import asserstion.assertfunctions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import driverIntializer.driverIntializer;
import readDataFromExcel.excelReader;
import readerUtils.readDataFromPeropertiesFile;
import reusableData.resusebaleData;
import seleniumActions.seleniumUIActions;

public class com_testcase_makemytrip {
	
	private static final Logger logger = LogManager.getLogger(com_testcase_makemytrip.class);
	
	@BeforeTest
	public void registerPageNavigation()
	{
		driverIntializer.launchdriver(resusebaleData.makemytrip);
		
		
	}

	@Test
	public void enterContactInformation() throws IOException
	{
		seleniumUIActions.implicitWait(10);
		driverIntializer.driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		//driverIntializer.driver.findElement(By.xpath("//p[@data-cy='oneWayTrip']")).click();
		driverIntializer.driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driverIntializer.driver.findElement(By.xpath("(//p[text()='Mumbai, India'])[1]")).click();
		
		driverIntializer.driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driverIntializer.driver.findElement(By.xpath("(//p[text()='Bengaluru, India'])[1]")).click();
		driverIntializer.driver.findElement(By.xpath("(//p[text()='28'])[1]")).click();
		driverIntializer.driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
//		LocalDate today = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//        String formattedDate = today.format(formatter);
//        System.out.println(formattedDate);
//        //05-Apr-2025
//        //
//		  By inputField = By.xpath("//input[@id='onward_cal']");
//		    JavascriptExecutor js = (JavascriptExecutor) driverIntializer.driver;
//		    js.executeScript("arguments[0].value='05-Apr-2025';", driverIntializer.driver.findElement(inputField));
	}
	
	
	@AfterTest
	public void  closeBrowser()
	{
		//driverIntializer.closebrowser();
		
	}
}
