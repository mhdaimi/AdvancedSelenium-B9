package date30May21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelector {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		browser.findElement(By.id("from")).click();
		
		Thread.sleep(2000);
		
		//browser.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[4]")).click();
		//browser.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]")).click();
		browser.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[4]")).click();
		
	}

}
