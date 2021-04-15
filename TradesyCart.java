import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TradesyCart {
    @Test
    public void verifyProductCanBeRemovedFromCart() throws InterruptedException {

        //This section is for interface set up. Telling the test to use Chromdriver to run the test
        // and to wait for element to visible

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.get("https://t1.qa.tradesy.com/");

        WebElement searchFeild = driver.findElement(By.cssSelector("[name='q']"));
        searchFeild.sendKeys("Bag");
        searchFeild.sendKeys(Keys.ENTER);

        WebElement aProduct = driver.findElement(By.xpath("(//*[@class='item-tile__image-link'])[1]"));
        // Note - When running this test product element should be changed so the same product is not run multiple
        // times to prevent from going into reserve state. Change the xpath [1] to [2] or [3].
        aProduct.click();

        WebElement addToBag = driver.findElement(By.cssSelector("[class='btn btn-primary btn-idp']"));
        addToBag.click();

        WebElement viewShoppingBag = driver.findElement(By.cssSelector
                ("[class='view-bag-button btn btn-secondary btn-block']"));
        viewShoppingBag.click();

        WebElement removeProduct = driver.findElement(By.cssSelector
                ("[class='cart-remove cart-button btn btn-secondary btn-small']"));
        removeProduct.click();

        WebElement shopNow = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        shopNow.isDisplayed();

        driver.quit();
    }


        @Test
        public void verifyUserCanSaveProductForLater  () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.get("https://t1.qa.tradesy.com/");

        WebElement searchFeild = driver.findElement(By.cssSelector("[name='q']"));
        searchFeild.sendKeys("Shoe");
        searchFeild.sendKeys(Keys.ENTER);

        WebElement aProduct = driver.findElement(By.xpath("(//*[@class='item-tile__image-link'])[3]"));
        // Note - When running this test product element should be changed so the same product is not run multiple
        // times to prevent from going into reserve state. Change the xpath [3] to [4] or [5].
        aProduct.click();

        WebElement addToBag = driver.findElement(By.cssSelector("[class='btn btn-primary btn-idp']"));
        addToBag.click();
        WebElement viewShoppingBag = driver.findElement(By.cssSelector
                ("[class='view-bag-button btn btn-secondary btn-block']"));
        viewShoppingBag.click();

        WebElement saveForLater = driver.findElement(By.cssSelector
                ("[class='cart-save-for-later cart-button btn btn-secondary btn-small']"));
        saveForLater.click();
        Thread.sleep(3000);

        WebElement saveForLaterPopUp =driver.findElement(By.cssSelector("[class='row tradesy-modal']"));
        saveForLaterPopUp.isDisplayed();

        driver.quit();


    }
}
