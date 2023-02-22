package AutomationProject1.WebMathEcap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class contactUs {

	public static void main(String[] args) {
		//Verfiy is user is able click on Contact us

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript ("window.scrollBy(0,350)", "");
		
		WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
		contactUs.click();
		
		driver.close();
	}

}
