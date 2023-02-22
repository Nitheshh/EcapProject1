package AutomationProject1.WebMathEcap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class generalMath {

	public static void main(String[] args) {

		//"Verify is user is able to open the General math page
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement generalMath = driver.findElement(By.linkText("General Math"));
		generalMath.click();
		String actual = driver.getTitle();
		String expected = "General Math - WebMath";
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");

		}

		driver.close();
	}

}


