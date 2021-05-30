package date30May21;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateSelectorFuture {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Data\\Jars-Exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		
		browser.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		browser.findElement(By.id("from")).click();
		
		String monthYear = getMonthYear(browser);	
		
		
		while(! monthYear.equals("Jan 2022")) {
			Thread.sleep(2000);
			browser.findElement(By.xpath("//a[@title='Next']")).click();
			monthYear = getMonthYear(browser);
		}
		
		System.out.println(monthYear);
		List<WebElement> allRows = browser.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
		System.out.println(allRows.size());
		
		for (WebElement row : allRows) {
			boolean found=false;
		  List<WebElement> allCells = row.findElements(By.tagName("td"));
		  for (WebElement cell : allCells) {
			String val = cell.getText();
			if(val.equals("26")) {
				cell.click();
				found=true;
				break;
			}
		}
		  
		  if(found) {
			  break;
		  }
			
		}
		
		
		
	}
	
	
	public static String getMonthYear(WebDriver browser) {
		Select select = new Select(browser.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		WebElement option = select.getFirstSelectedOption();
		String month = option.getText();
		//System.out.println(month);
		
		String year = browser.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		//System.out.println(year);
		
		return month + " " + year;
	}

}
