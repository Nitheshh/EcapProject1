package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebMathProject1 {
	WebDriver driver;

	@Test(priority =1)
	public void general() {
		//"Verify is user is able to open the General math page
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
	}

	@Test (priority =2)
	public void hyperLink() {
		//"Verify if user is able to click on 'Help me count it!' Under coins, cointing option"

		WebElement help = driver.findElement(By.linkText("Help typing in your math problems"));
		help.click();
		driver.navigate().back();
	}

	@Test (priority =3)
	public void contactUs() {
		//Verfiy is user is able click on Contact us

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript ("window.scrollBy(0,350)", "");
		WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
		contactUs.click();	
		driver.navigate().back();
	}

	@Test (priority =4)
	public void privacy() {
		//Verify if user able to open the Privacy policy page

		WebElement privacy = driver.findElement(By.linkText("Privacy Policy"));
		privacy.click();	
		Boolean text = driver.findElement(By.partialLinkText("Privacy ")).isDisplayed();
		if (text) {
			System.out.println("Element present");
		}
		else {
			System.out.println("Element not present");
		}
	}

	@Test (priority =5)
	public void faqs() {
		//Verify if user is able to click on FAQs under privacy policy
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript ("window.scrollBy(0,400)", "");
		WebElement faqs = driver.findElement(By.linkText("FAQs"));
		faqs.click();
		driver.navigate().back();
		driver.navigate().back();
	}

	@Test (priority = 6)
	public void dropDown() {
		//Verify is user is able to open the 'Coins,Counting' option from the dropdown
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript ("window.scrollBy(0,-350)", "");
		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='topicItem']"));
		//"Verify is user is able to Enter the numbers in the coins, counting page


		Select coins = new Select(dropDown);
		coins.selectByIndex(4);
		WebElement coin = driver.findElement(By.xpath("//input[@name='q']"));
		coin.sendKeys("5");
		WebElement coin1 = driver.findElement(By.xpath("//input[@name='d']"));
		coin1.sendKeys("6");
		WebElement coin2 = driver.findElement(By.xpath("//input[@name='n']"));
		coin2.sendKeys("5");
		WebElement coin3 = driver.findElement(By.xpath("//input[@name='p']"));
		coin3.sendKeys("5");
	}

	@Test(priority = 7)
	public void submit() {
		// "Verify if user is able to click on 'Help me count it!' Under coins, cointing option"

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();

	}

	@Test(priority = 8)
	public void backToMath() {
		WebElement imageLink = driver.findElements(By.tagName("a")).get(2);
		imageLink.click();
	}
	@Test(priority = 9)
	public void otherStaff() {
		//"Verifuy if user is able to click on Sample Data under Other staff

		WebElement click = driver.findElement(By.linkText("Other Stuff"));
		click.click();
		WebElement sample = driver.findElement(By.linkText("Sample Data"));
		sample.click();
	}
	@Test(priority = 10)
	public void trig() {
		//Verify if user is able to click on Derivatives under Trig. calculus

		WebElement click = driver.findElement(By.linkText("Trig. & Calculus"));
		click.click();
		WebElement derivatives = driver.findElement(By.linkText("Derivatives"));
		derivatives.click();

	}

	@BeforeClass
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.webmath.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
