package AutomationProject1.WebMathEcap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class submitButton {

	public static void main(String[] args) {
		
		// "Verify if user is able to click on 'Help me count it!' Under coins, cointing option"
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='topicItem']"));
		//"Verify is user is able to Enter the numbers in the coins, counting page


		Select coins = new Select(dropdown);
		coins.selectByIndex(4);
		WebElement coin = driver.findElement(By.xpath("//input[@name='q']"));
		coin.sendKeys("5");
		WebElement coin1 = driver.findElement(By.xpath("//input[@name='d']"));
		coin1.sendKeys("6");
		WebElement coin2 = driver.findElement(By.xpath("//input[@name='n']"));
		coin2.sendKeys("5");
		WebElement coin3 = driver.findElement(By.xpath("//input[@name='p']"));
		coin3.sendKeys("5");

		// "Verify if user is able to click on 'Help me count it!' Under coins, cointing option"

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();


		driver.close();
	}




}
