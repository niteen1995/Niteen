package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class m1ClickandHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[4]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(source).build().perform();
		act.clickAndHold().perform();
		act.moveToElement(destination).build().perform();
		Thread.sleep(3000);
		act.release();
		
		Thread.sleep(5000);

	}

}
