package date30May21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String val = browser.findElement(By.xpath("//table[@id='product']/tbody/tr[4]/td[2]")).getText();
		
		System.out.println(val);
	}

}
