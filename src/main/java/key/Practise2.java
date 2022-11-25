package key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise2 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		WebElement box1 = driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
		WebElement box2 = driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		
		Actions act = new Actions(driver);
		box1.sendKeys("Hello Everyone");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		Thread.sleep(4000);
		driver.close();
		
		
		

	}

}
