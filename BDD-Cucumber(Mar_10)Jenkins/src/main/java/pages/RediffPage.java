package pages;

import Base.BaseTest;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffPage {
	private WebDriver driver;
	Scanner sc=new Scanner(System.in);

	// Locators
	private By signInButton = By.linkText("Sign in");
	//private By createAccountButton = By.xpath("//a[text()='Create Account']");
	private By usernameField = By.id("login1");
	private By passwordField = By.id("password");
	private By loginButton = By.name("proceed");

	public RediffPage() {
		this.driver = BaseTest.getDriver();
	}

	public void navigateToRediff() {
		driver.get("https://www.rediff.com/");
	}

	public void clickSignIn() {
		driver.findElement(signInButton).click();
	}

	public void enterLoginCredentials(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	public void clickCreateAccount() {
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(), 'Create Account')]"));
		ele.click();
	}

	public void enterRegistrationDetails(String fullName, String rediffId, String password, String retypePassword,
			String alternateEmail, String mobile, String day, String month, String year, String gender, String country,
			String city) {
		
		WebElement ele = driver.findElement(By.xpath("//input[1]"));
		ele.sendKeys(fullName);

		ele = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		ele.sendKeys(rediffId);

		ele = driver.findElement(By.xpath("//*[@id=\"newpasswd\"]"));
		ele.sendKeys(password);

		ele = driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]"));
		ele.sendKeys(retypePassword);

		ele = driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input"));
		ele.sendKeys(alternateEmail);

		ele = driver.findElement(By.xpath("//input[@id='mobno']"));
		ele.sendKeys(mobile);

		// Select Date of Birth
		ele = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		new Select(ele).selectByVisibleText(day);

		ele = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		new Select(ele).selectByVisibleText(month);

		ele = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		new Select(ele).selectByVisibleText(year);

		// Select Gender
		if (gender.equalsIgnoreCase("Male")) {
			ele = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		} else {
			ele = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
		}
		ele.click();

		// Select Country
		ele = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		new Select(ele).selectByVisibleText(country);

		ele = driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
		ele.sendKeys(city);
		ele=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input"));
		System.out.println("captcha");
		ele.sendKeys(sc.next());
	}

	public void clickSubmit() {
		WebElement ele = driver.findElement(By.xpath("//input[@type='submit']"));
		ele.click();
	}

	public boolean isRegistrationSuccessful() {
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(), 'successfully registered')]"));
		return ele.isDisplayed();
	}
	public void captcha() {
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"imagetext\"]"));
		System.out.println("enter capthaaa");
		ele.sendKeys(sc.next());
		driver.findElement(By.xpath("//*[@id=\"mcontrol\"]/div[3]/input[2]")).click();
	}
}
