package day1firsthalf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDrivers {

	
		 public static WebDriver getDriver(String Brw) {
			if (Brw.equals("CRM"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\TRAINING_H2A.06.17\\potnurusandeep\\drivers\\chromedriver.exe");
				return new ChromeDriver();
				
		    }
			else if (Brw.equals("IEEE"))
			{

				System.setProperty("webdriver.ie.driver", "C:\\Users\\TRAINING_H2A.06.17\\potnurusandeep\\drivers\\IEDriverServer.exe");
				return new InternetExplorerDriver();
			}
			
			else if (Brw.equals("FF"))
					{

						System.setProperty("webdriver.gecko.driver", "C:\\Users\\TRAINING_H2A.06.17\\potnurusandeep\\drivers\\geckodriver.exe");
						return new FirefoxDriver();
					}
			return null;
			
			
	}

}

