package AutomationProject1.WebMathEcap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleData {

	public static void main(String[] args) {
		
		//"Verify if user is able to click on Sample Data under Other staff
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		
		WebElement click = driver.findElement(By.linkText("Other Stuff"));
		click.click();
		WebElement sample = driver.findElement(By.linkText("Sample Data"));
		sample.click();
		driver.close();
	}

}
