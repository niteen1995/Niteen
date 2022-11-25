package newMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		
		
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/header/div/div[1]/span[2]/nav/span[2]/a")).submit();
		
		Thread.sleep(4000);
		 
		driver.close();

	}

}
