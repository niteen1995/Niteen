package newMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MControl {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]/../.."));
		
		act.moveToElement(ele).build().perform();
		
		
	    Thread.sleep(4000);
	    
	    driver.close();
		

	}

}
