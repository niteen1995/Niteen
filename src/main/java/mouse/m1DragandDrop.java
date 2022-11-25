package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class m1DragandDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//div[contains(text(),'Scientech Easy')]"));
		WebElement destination = driver.findElement(By.xpath("//div[contains(text(),'Drop here')]"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, destination).perform();
	}
}
