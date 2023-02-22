package AutomationProject1.WebMathEcap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class privacyPolicyFaqs {

	public static void main(String[] args) {
		//Verify if user is able to click on FAQs under privacy policy

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript ("window.scrollBy(0,500)", "");
		WebElement privacy = driver.findElement(By.linkText("Privacy Policy"));
		privacy.click();	

		Boolean text = driver.findElement(By.partialLinkText("Privacy ")).isDisplayed();
		if (text) {
			System.out.println("Element present");
		}
		else {
			System.out.println("Element not present");
		}
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript ("window.scrollBy(0,500)", "");
		
		WebElement faqs = driver.findElement(By.linkText("FAQs"));
		faqs.click();

		driver.close();

	}

}
