package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
//		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]/../.."));
//		act.moveToElement(element).build().perform();
//		act.contextClick(element).build().perform();
		
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Electronics devices for home office')]/.."));
		
		Thread.sleep(4000);
		
		act.scrollToElement(element).perform();
		
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
