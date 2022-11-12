package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {

    WebDriver driver  = null;

    @Given("user opens the browser")
    public void user_opens_the_browser() {

        System.out.println("Inside step- browser is open");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user navigates to the login page of the site")
    public void user_navigates_to_the_login_page_of_the_site() {

        driver.navigate().to("https://example.testproject.io/web");
    }

    @When("^enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enters_username_and_password(String username, String password) throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
    }

    @And("user clicks on login")
    public void user_clicks_on_login() throws InterruptedException {
        driver.findElement(By.id("login")).click();

    }


    @Then("user navigates to the home page")
    public void user_navigates_to_the_home_page() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.id("logout")).isDisplayed());
        Thread.sleep(4000);
        driver.close();
        driver.quit();
    }

}








































































































































































































































































































































































