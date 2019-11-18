package skeleton;

//test

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		  System.setProperty("webdriver.chrome.driver", "C:/kashyap/chromedriver.exe/");
			driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			Thread.sleep(500);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user provides the correct credentials")
	public void user_provides_the_correct_credentials() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.linkText("Log in")).click();
	        Thread.sleep(500);
	        driver.findElement(By.id("Email")).sendKeys("TestUser_SQ@mail.test");
	        driver.findElement(By.id("Password")).sendKeys("Test_Password");
	        driver.findElement(By.cssSelector("input[value='Log in']")).click();
	        Thread.sleep(1000);
		
	    
	}

	@Then("user should succesfully login")
	public void user_should_succesfully_login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.linkText("Log out")).click();
	        Thread.sleep(1000);
	        driver.close();
	    
	}
}
