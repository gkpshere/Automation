package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.ebay.com/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("mouse");
				driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
				driver.close();

	}

}
