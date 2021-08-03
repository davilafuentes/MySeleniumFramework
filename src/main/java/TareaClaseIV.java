import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TareaClaseIV {

    public static void main (String[] args) {

        //WebDriver Initialization.
        String pathToDriver = Test.class.getResource("/chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver", pathToDriver);
        WebDriver driver = new ChromeDriver();;

        //Navigate to Login Page.
        driver.get("https://demo.opencart.com");

        //Search "macbook" in the search bar.
        WebElement searchBar = driver.findElement(By.name("search"));
        searchBar.sendKeys("macbook");

        //Click the search bar.
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();

        //Add the product to the shopping cart.
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();

        //make sure the success message popup.
        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"product-search\"]/div[1]"));
        Assert.assertTrue(successMessage.isDisplayed());

        //Close and quit the driver instance.
        driver.close();
        driver.quit();
    }

}
