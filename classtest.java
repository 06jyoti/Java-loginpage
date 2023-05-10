package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classtest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.manage().window();
		driver.findElement(By.id("inputUsername")).sendKeys("Sheetal");
		driver.findElement(By.name("inputPassword")).sendKeys("hey");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("jyoti");  
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com"); 	
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();	
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jyoti@gmail.com"); 		
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("jyoti");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(3000);
	   // driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	//	System.out.println(driver.findElement(By.cssSelector("button.logout-btn")).getText());
	
		
		//driver.close();
		
	}

}
