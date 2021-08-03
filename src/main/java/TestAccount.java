import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAccount {

    @Test
    public void Test_Login_Successful(){
        String pathToDriver = Test.class.getResource("/chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver", pathToDriver);
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com");

    }

}
