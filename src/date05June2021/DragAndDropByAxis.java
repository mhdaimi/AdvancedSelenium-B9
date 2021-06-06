package date05June2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByAxis {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("https://demoqa.com/dragabble");
		
		WebElement dragBox = browser.findElement(By.id("dragBox"));
		
		Thread.sleep(3000);
		
		Actions action = new Actions(browser);
		
		action.dragAndDropBy(dragBox, 150, 200).build().perform();
		
		
	}

}
