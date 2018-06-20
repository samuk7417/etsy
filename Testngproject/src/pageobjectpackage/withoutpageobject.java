package pageobjectpackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutpageobject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("search-query")).sendKeys("sports shoes");
		driver.findElement(By.xpath("//*[@id='gnav-search']/div/div[2]/button")).click();
		
		driver.manage().window().maximize();
					
driver.findElement(By.xpath("//*[@id='search-filter-reset-form']/div[6]/div/div/div/label[3]/a")).click();

driver.findElement(By.xpath("//*[@id='search-filter-reset-form']/div[6]/div/div/div/label[2]/a")).click();
					
driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/div/div[2]/div[2]/div[4]/div[3]/a/div[1]/div/div[1]/div/div/div/img")).getAttribute("//*[@id='content']/div/div[1]/div/div/div[2]/div[2]/div[4]/div[3]/a/div[2]/div/p[2]/span[1]/span[2]");


List<WebElement> prices = driver.findElements(By.xpath(".//*[@class='currency-value']"));

System.out.println("Total Proces captured:"+ prices.size());


for (int i=2; i<=10; i++) 
{
	String x=prices.get(i).getText();
	 System.out.println(x);
} 


}

}

