package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private WebDriver driver;

    private By searchInput = By.name("search");
    private By searchButton = By.xpath("//*[@id=\"search\"]/span/button");
    private By productThumb = By.cssSelector(".product-thumb");

    public SearchPage(WebDriver _driver) {
        this.driver = _driver;
    }

    public void searchByEnter(String searchCriteria) {
        this.driver.findElement(searchInput).sendKeys(searchCriteria, Keys.ENTER);
    }

    public int getSearchIntResults() {
        return this.driver.findElements(productThumb).size();
    }

    public boolean isSearchInUrl(String searchCriteria) {
        return this.driver.getCurrentUrl().contains("search=" + searchCriteria);
    }
}