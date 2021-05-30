package date30May21;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("http://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> allRows = browser.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for (WebElement row : allRows) {
			List<WebElement> allCells = row.findElements(By.tagName("td"));
			String companyName = allCells.get(0).getText();
			
			if(companyName.equals("YES Bank Ltd.")) {
				System.out.println(companyName);
				System.out.println("Current Price: " + allCells.get(3).getText());
			}
			
		}
		
		
		
	}

}
