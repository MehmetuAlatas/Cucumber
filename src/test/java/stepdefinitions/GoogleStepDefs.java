package stepdefinitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefs {

    GooglePage googlePage = new GooglePage();

    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
//WRITE YOUR CODE IN HERE FOR THIS STEP
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }




    @When("user search for iphone on google")
    public void user_search_for_iphone_on_google() {
        // Write code here that turns the phrase above into concrete actions
        googlePage.searchBox.sendKeys("iPhone"+Keys.ENTER);
    }

    @Then("verify the page title has iPhone")
    public void verify_the_page_title_has_i_phone() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));

    }


    @And("close the driver")
    public void closeTheDriver() {
        Driver.closeDriver();
    }
}