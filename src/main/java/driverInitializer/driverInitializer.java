package driverInitializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import reusableData.reusableData;

public class driverInitializer {
	public static WebDriver driver;
	public static void launchDriver(String url)
	{
		if(reusableData.browserCategory.equals("chrome"))
		{
			System.setProperty(reusableData.chromeDriverType,reusableData.chromeDriverPath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(reusableData.url);
		}
		else if(reusableData.browserCategory.equals("edge"))
		{
			System.setProperty(reusableData.edgeDriverType,reusableData.edgeDriverPath);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else {
			System.out.println("Invalid browser type");
		}

	}

}
