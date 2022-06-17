package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//path od features folder
        glue = "stepdefinitions",//path of the step definitions folder
        tags = "@admin_login",
        dryRun = false
)
public class Runner {
}
/*
Runner class is used to run the feature files
@RunWith : makes this class runnable
@CucumberOptions :
    1. features : path of the features folder
    2. glue : path of the step definitions folder
 */
/**
 * #Scenario Outline is used to run same scenario multiple times with different data
 * #  Scenario Outline must be followed with example keyword
 * #  Examples keyword is used for sending different test data
 * #  Scenario Outline is used for DDT (Data Driven Testing) This is similar with testing excel sheet
 */