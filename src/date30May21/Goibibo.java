package date30May21;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("https://www.goibibo.com/");
		
		browser.findElement(By.id("gosuggest_inputSrc")).sendKeys("Mumbai");
		browser.findElement(By.xpath("//ul[@id='react-autosuggest-1']/li")).click();
		
		browser.findElement(By.id("gosuggest_inputDest")).sendKeys("Delhi");
		browser.findElement(By.xpath("//ul[@id='react-autosuggest-1']/li")).click();
		
		browser.findElement(By.id("fare_20210530")).click();
		browser.findElement(By.id("gi_search_btn")).click();
		Thread.sleep(10000);
		List<WebElement> allResult = browser.findElements(By.xpath("//*[@class='srp-card-uistyles__SeoCard-sc-3flq99-4 hdwBJW']"));
		System.out.println(allResult.size());
		for (WebElement result : allResult) {
			String flightName;
			try {
				flightName = result.findElement(By.xpath("./div[3]/div/div/div/span[2]")).getText();
				System.out.println(flightName); 
			} catch (Exception e) {
				flightName = result.findElement(By.xpath("./div/div/div/div/span[2]")).getText();
				System.out.println(flightName); 
			}
			
			if(flightName.equals("Vistara")) {
				result.findElement(By.xpath("./div[2]/div[2]/div[2]/div/button")).click();
				break;
			}
			
		}
		
	}

}
