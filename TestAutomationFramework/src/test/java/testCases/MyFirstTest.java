package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		System.out.println("Title: " + driver.getTitle());
//		
//		driver.close();
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver1 = new FirefoxDriver(); 
//		driver1.get("https://www.expedia.com/");
//		System.out.println("Title: " + driver1.getTitle());
//		
//		driver1.close();

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options); 
        driver.get("https://www.expedia.com");
        System.out.println("Page title is: " + driver.getTitle());
        
        driver.findElement(By.xpath("//button[@aria-label='Where to?']")).sendKeys("NYC");
        driver.findElement(By.xpath("//button[@name='EGDSDateRange-date-selector-trigger']")).click();
        
        //driver.findElement(By.xpath("//button[@name='EGDSDateRange-date-selector-trigger']")).sendKeys("" + Keys.ENTER);
        
        driver.findElement(By.xpath("//button[@name='EGDSDateRange-date-selector-trigger']")).sendKeys("sat, Jun 21");
        driver.findElement(By.xpath("//button[@id='search_button']")).click();
        
        
        driver.quit();
	}

}
