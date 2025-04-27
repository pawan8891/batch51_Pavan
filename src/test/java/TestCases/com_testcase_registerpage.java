package TestCases;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import asserstion.assertfunctions;
import dataBaseConnectionDetails.DBUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import driverIntializer.driverIntializer;
import readDataFromExcel.excelReader;
import readerUtils.readDataFromPeropertiesFile;
import reusableData.resusebaleData;
import seleniumActions.seleniumUIActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class com_testcase_registerpage {
	
	private static final Logger logger = LogManager.getLogger(com_testcase_registerpage.class);
	@BeforeTest
	public void registerPageNavigation()
	{
		driverIntializer.launchdriver(resusebaleData.url);
		logger.info("User is on registration page using url:"+resusebaleData.url);
		logger.info("User is on the Register Page with URL Used is :=>"+resusebaleData.url);	
		driverIntializer.driver.manage().deleteAllCookies();
	}
	
	@DataProvider(name="logintestData")
	public static Object[][] logintestdata()
	{
		logger.info("********User enters data in contact information section********");
		//logger.info("User enters first name using xpath:"+resusebaleData.regiterORPath+"and value as:"+excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 0));
		return new Object[][]
				{
			
			{"FirstName","neelam"},
			{"LastName","test"},
			
				};
	}

	
	
	
	@Test
	public void enterContactInformation() throws Exception
	{
		DBUtils db = new DBUtils();
		Connection connect = db.DBConnection();
	    Statement smt = connect.createStatement();
	    
	    
		String sqlQuert = "SELECT CustomerID FROM Customers where City = 'Berlin'";
		ResultSet  set = null;
		set = smt.executeQuery(sqlQuert);
		
		while(set.next())
		{
			int id = set.getInt("CustomerID");
			List list = new ArrayList();
			list.add(id);
			list.get(3);
			
			String custname = set.getString("CustomerName");
		}
        
		
		
		logger.info("***************This Steps included adding the data for ContactInformation***************");
		logger.info("User enters Firstname and the Xpath is" + excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 0));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.ContactInformation.FirstName.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 0));
		logger.info("User enters last name using xpath:"+resusebaleData.regiterORPath+"and value as:"+excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 1));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.ContactInformation.LastName.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 1));
		logger.info("User enters phone number using xpath:"+resusebaleData.regiterORPath+"and value as:"+excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 2));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.ContactInformation.phone.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 2));
		logger.info("User enters user name using xpath:"+resusebaleData.regiterORPath+"and value as:"+excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 3));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.ContactInformation.userName.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 3));
//		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.ContactInformation.phone.input", "1224");
//		seleniumUIActions.takescreenshot();
		logger.info("User enters phone and the Xpath is" + excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 0));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.ContactInformation.phone.input", "1224");
		logger.info("***************This Steps ended for ContactInformation***************");
	}

	@Test
	public void enterMailingInformation() throws IOException
	{
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.MailingInformation.address1.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_mailInfo, 1, 0));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.MailingInformation.city.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_mailInfo, 1, 1));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.MailingInformation.state.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_mailInfo, 1, 2));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.MailingInformation.postalcode.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_mailInfo, 1, 3));
		seleniumUIActions.selectDropdownValue("Register.MailingInformation.country.select",resusebaleData.countryNameSelectDropdown);
	}
	@Test
	public void enterUserInformation() throws IOException
	{
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.UserInformation.userName.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_userInfo, 1, 0));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.UserInformation.password.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_userInfo, 1, 1));
		seleniumUIActions.enterValueinUI(resusebaleData.regiterORPath, "Register.UserInformation.confirmPassword.input", excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_userInfo, 1, 1));
		driverIntializer.driver.findElement(By.xpath("//input[@name='submit']")).click();
		String name = excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_Contact, 1, 0);
//		Random random = new Random();
//        int randomNumber = random.nextInt(1000); // Generates a random number between 0 and 999
//        String result =name +  randomNumber;
		String username = seleniumUIActions.getTextfromUI("//b[contains(text(),'Your user name is')]", "Yes");
		System.out.println("the value fetched from UI" + username);
		assertfunctions.hardassert(username,excelReader.readTestDataFromExcel(resusebaleData.excelpath, resusebaleData.sheetname_userInfo, 1, 0) );
	}
	
	public static void handleAlert(String alertType)
	{
		Alert alert = driverIntializer.driver.switchTo().alert();
		if(alertType.equalsIgnoreCase("accept"))
		{
			alert.accept();
		}
		else if(alertType.equalsIgnoreCase("dismiss"))
		{
		alert.dismiss();
		}
		
	}
	@AfterClass
	public void  closeBrowser() throws Exception
	{
		driverIntializer.closebrowser();
		DBUtils db = new DBUtils();
		Connection connect = db.DBConnection();
	    Statement smt = connect.createStatement();
		String sqlQuert = "delete * from Customers where CustomerID = 1'";
		ResultSet  set = null;
		set = smt.executeQuery(sqlQuert);
	}
}
