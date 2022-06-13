package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.util.List;

public class TC22_TestCasesPage {

    public  TC22_TestCasesPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement recommendedItemsTitle;

//    @FindBy (xpath = "(//div[@class='recommended_items']//div[@class='productinfo text-center'])[1]")
//    public WebElement recommendedItem;


    @FindBy (xpath = "(//div[@class='recommended_items']//*[text()='Add to cart'])[1]")
    public WebElement addToCart;

    @FindBy (xpath = "//*[text()='View Cart']")
    public WebElement viewCart;




}
