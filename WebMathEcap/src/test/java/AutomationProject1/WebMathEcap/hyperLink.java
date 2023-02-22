package AutomationProject1.WebMathEcap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hyperLink {

	public static void main(String[] args) {
		//"Verify if user is able to click on 'Help me count it!' Under General Math"
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement generalMath = driver.findElement(By.linkText("General Math"));
		generalMath.click();
		
		WebElement help = driver.findElement(By.linkText("Help typing in your math problems"));
		help.click();
		
        driver.close();
	}
}


