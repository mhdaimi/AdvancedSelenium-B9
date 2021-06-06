package date05June2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterCapitalLetters {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("https://www.goibibo.com/");
		
		WebElement src =  browser.findElement(By.id("gosuggest_inputSrc"));
		
		//src.sendKeys("DELHI");
		
		Actions action = new Actions(browser);
		
		action.keyDown(src, Keys.SHIFT).sendKeys("delhi").keyUp(src, Keys.SHIFT).build().perform();
		
	}

}
