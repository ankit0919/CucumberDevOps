package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {

        System.out.println("Inside step- browser is open");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside step- user is on google search page");
        driver.navigate().to("https://google.com");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("Inside step- user enters a text in search page");
        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
    }

    @When("hits enter")
    public void hits_enter() {
        System.out.println("Inside step- hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside step - user is navigated to search results");

        driver.getPageSource().contains("Online Courser");
        driver.quit();
    }



}
