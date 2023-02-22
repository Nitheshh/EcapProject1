package AutomationProject1.WebMathEcap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class privacyPolicy {

	public static void main(String[] args) {
		//Verify if user able to open the Privacy policy page
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript ("window.scrollBy(0,350)", "");
		
		WebElement privacy = driver.findElement(By.linkText("Privacy Policy"));
		privacy.click();	
		
		Boolean text = driver.findElement(By.partialLinkText("Privacy ")).isDisplayed();
		if (text) {
			System.out.println("Element present");
		}
		else {
			System.out.println("Element not present");
		}
		driver.close();

	}

}
