package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb25 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String var = "Log in";
		
		driver.findElement(By.xpath("//button[text()='"+var+"']")).click();
		Thread.sleep(3000);
	
		driver.close();

	}

}
