package newMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).build().perform();
		act.contextClick().build().perform();
		
		Thread.sleep(4000);

	}

}
