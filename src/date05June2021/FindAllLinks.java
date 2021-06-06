package date05June2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindAllLinks {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		//browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("https://www.google.com/");
		
		WebDriverWait wait = new WebDriverWait(browser, 10);
		
		List<WebElement> result = wait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 30));
		
		System.out.println(result.size());
		
//		List<WebElement> allAnchorTags = browser.findElements(By.tagName("a"));
//		
//		System.out.println(allAnchorTags.size());
		
		
	}

}
