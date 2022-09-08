package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Sample page
 */
public class RestaurantsColognePage extends Page {

    public static String RESTAURANTS_URL = BASE_URL + "/en/result?destination=koeln&bookable=true";

    public static String TEXT_SCHOW_LESS = "Show less";
    public static String TEXT_VERIFICATION= "Cuisine: American";
    public static String TEXT_EMAIL = "Email address";
    //test data


    public RestaurantsColognePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//*[@data-qa='show-all-button']")
    static WebElement filterButton;

    @FindBy(xpath = "//*[@data-qa='show-all-button']")
    static WebElement filterButtonText;

    @FindBy(xpath = "//div[@id=\'desktop-filters-wrapper\']/div[2]/div[2]/div/li[2]/label/i")
    static WebElement inputCheckBox;

    @FindBy(xpath = "//div[@id='desktop-filters-wrapper']/div/div[2]/div/span")
    static WebElement verificationText;

    @FindBy(xpath = "//div[2]/a")
    static WebElement checkLogin;

    @FindBy(xpath = "//div[@id='root']/div/div/form/section/div[6]/div/label/div")
    static WebElement emailTabText;

    public void clickOnFilterButton() throws InterruptedException {
        filterButton.click();
        Thread.sleep(5000);
    }

    public String getFilterButtonText() {
        return filterButtonText.getText();
    }
    public void clickOnInputCheckBox() throws InterruptedException {
        inputCheckBox.click();
        Thread.sleep(5000);
    }
    public String getVerificationText(){
        return verificationText.getText();
    }
    public void clickOnBtnLogin() throws InterruptedException {
        checkLogin.click();
        Thread.sleep(5000);
    }
    public String getEmailTabText(){
        return emailTabText.getText();
    }

}
