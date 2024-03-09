package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SACHIN R\\Downloads\\chrome-win32.zip\\chrome-win32");
		driver=new ChromeDriver();
		driver.get("https://www.practicetestautomation.com/practice-test-login/");


	}
    @When("^title of the login page$")
    public void  title_of_the_login_page()
    {
    	String title = driver.getTitle();
    	System.out.println("title");
    	Assert.assertEquals("Test Login | Practice Test Automation", title);
    }
    @Then("^user enters username and password$")
    public void user_enters_username_and_password() {
    	driver.findElement(By.id("username")).sendKeys("student");
    	driver.findElement(By.id("password")).sendKeys("Password123");

    }

   @Then("^user click on submit button$")
    public void user_click_on_submit_button() {
    	WebElement loginbutton = driver.findElement(By.id("submit"));
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("arguements[0].click();",loginbutton);
    }
   
    @And("^user is on homepage$")
    public void user_is_on_homepage() {
    	String title1 = driver.getTitle();
    	System.out.println("title1");
    	Assert.assertEquals("Logged In Successfully | Practice Test Automation", title1);
    }

}
