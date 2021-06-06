package date05June2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("http://demo.guru99.com/test/drag_drop.html");
		
		//WebElement src = browser.findElement(By.xpath("//*[@id='todrag']/span[1]"));
		WebElement src = browser.findElement(By.id("credit2"));
		
		WebElement dest = browser.findElement(By.xpath("//*[@id='bank']/li"));
		
		Thread.sleep(2000);
		
		Actions action = new Actions(browser);
		
		action.dragAndDrop(src, dest).build().perform();
		
		Thread.sleep(2000);
		
		WebElement src1 = browser.findElement(By.id("credit1"));
		
		WebElement dest1 = browser.findElement(By.xpath("//ol[@id='loan']/li"));
		
		action.dragAndDrop(src1, dest1).build().perform();
		

	}

}
