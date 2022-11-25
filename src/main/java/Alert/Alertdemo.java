package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		Thread.sleep(3000);
	
//		driver.findElement(By.xpath("//*[@id=\"confirmBox\"]")).click();
//		Alert alert1= driver.switchTo().alert();
//		alert1.dismiss();
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.sendKeys("Niteen");
		alert2.accept();
		
		}

}
