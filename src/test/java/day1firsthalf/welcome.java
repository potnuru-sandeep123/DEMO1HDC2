package day1firsthalf;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class welcome {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TRAINING_H2A.06.17\\potnurusandeep\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Dimension d = new Dimension(300,600);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		Point p = new Point(300,200);
		driver.manage().window().setPosition(p);
		
		String A_title = driver.getTitle();
		String E_title = "Google";
		if (A_title.endsWith(E_title))
		{
			System.out.println("Application is accessible");
		}
		else
		
		{
			System.out.println("Application is down");
		}
		
	}

}
