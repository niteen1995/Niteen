package mousefunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M2mouse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement element =driver.findElement(By.xpath("//h2[contains(text(),'Birthday store')]"));
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(element).perform();
		//act.contextClick().perform();
		
		act.scrollToElement(element).perform();		
		
		Thread.sleep(4000);
		
		WebElement scrollup = driver.findElement(By.xpath("//h2[contains(text(),'Shop & Pay')]"));
		act.scrollToElement(scrollup).perform();
		
		Thread.sleep(4000);
		
	

	}

}
