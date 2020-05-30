import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class GoodleSearchTest {
    @Test
    public void test000001() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String queryString = "Portnov Computer School";
        driver.get("https://www.google.com/");

        WebElement textInput = driver.findElement(By.cssSelector(".gLFyf"));
        textInput.sendKeys(queryString);
        textInput.submit();

        try {
            sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement resultsStatsElement = driver.findElement (By.id("result-stats"));
        String resultsStatsText = resultsStatsElement.getText();
        String[] stringArray = resultsStatsText.split(" ");
        String amountOfResults = stringArray[2];
        String amountOfResultsFixes = amountOfResults.replace(",","");
        int amountOfResultsParsed = Integer.parseInt(amountOfResultsFixes);
        Assert.assertTrue(amountOfResultsParsed>100);

    }
}
