package AutomationProject1.WebMathEcap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class derivatives {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		WebElement click = driver.findElement(By.linkText("Trig. & Calculus"));
		click.click();
		WebElement derivatives = driver.findElement(By.linkText("Derivatives"));
		derivatives.click();
		driver.close();

	}

}
