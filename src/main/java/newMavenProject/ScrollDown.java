package newMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Birthday store')]"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(element).perform();

	}

}
