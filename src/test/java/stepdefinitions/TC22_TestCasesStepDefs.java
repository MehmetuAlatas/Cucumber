package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TC22_TestCasesPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class TC22_TestCasesStepDefs {
    TC22_TestCasesPage test22= new TC22_TestCasesPage();
    @Given("user launches the browserr")
    public void user_launches_the_browserr() {
        Driver.getDriver();
    }

    @When("user navigate to URL")
    public void user_navigate_to_url() {
     Driver.getDriver().get("https://www.automationexercise.com/");
    }

    @Then("user scroll to bottom of page")
    public void user_scroll_to_bottom_of_page() {
        JSUtils.scrollIntoViewJS(test22.recommendedItemsTitle);
//        Actions actions=new Actions(Driver.getDriver());
//        actions.moveToElement(test22.recommendedItemsTitle).perform();

    }

    @Then("user verifies that RECOMMENDED ITEMS are visible")
    public void user_verifies_that_recommended_ıtems_are_visible() {
        ReusableMethods.waitForVisibility(test22.recommendedItemsTitle,5);
        Assert.assertTrue(test22.recommendedItemsTitle.isDisplayed());

    }

    @Then("user clicks on Add to chart on RECOMMENDED product")
    public void user_clicks_on_add_to_chart_on_recommended_product() {
        ReusableMethods.waitForVisibility(test22.addToCart,5);
        test22.addToCart.click();

    }

    @Then("user clicks on view cart button")
    public void user_clicks_on_view_cart_button() {
        ReusableMethods.waitForVisibility(test22.viewCart,5);
        test22.viewCart.click();

    }

    @Then("user verifies that product is displayed in cart page")
    public void user_verifies_that_product_is_displayed_in_cart_page() {
        JSUtils.scrollIntoViewJS(test22.verifyingWithText);
        String actual=test22.verifyingWithText.getText();
        String expected="Stylish Dress";
        Assert.assertEquals(expected,actual);
        System.out.println("actual = " + actual);

    }

    @Then("user closes the browserr")
    public void user_closes_the_browserr() {
      //  Driver.closeDriver();

    }

}
