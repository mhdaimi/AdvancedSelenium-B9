package date05June2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("https://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		
		browser.findElement(By.id("save")).click();
		
		WebDriverWait wait = new WebDriverWait(browser, 10);
		
		boolean result = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("loading"), "First Name"));
		
		System.out.println(result);
		
		if(result) {
			String text = browser.findElement(By.id("loading")).getText();
			System.out.println("Text of element: " + text);
		}
		
	}

}
