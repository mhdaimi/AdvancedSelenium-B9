package date05June2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("https://www.goibibo.com/");
		
		WebElement src =  browser.findElement(By.id("gosuggest_inputSrc"));
		
		src.sendKeys("Delhi");
		
		Actions action = new Actions(browser);
		
		action.doubleClick(src).build().perform();
		
		src.sendKeys(Keys.chord(Keys.CONTROL, "x"));
		
		Thread.sleep(2000);
		
		WebElement dest = browser.findElement(By.id("gosuggest_inputDest"));
		
		dest.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
	}

}
