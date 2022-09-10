package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantsColognePage extends Page {

    /**
     * Sample page
     */
    public static String RESTAURANTS_URL = BASE_URL + "/en/result?destination=koeln&bookable=true";

    /**
     * test constants
     */
    public static String TEXT_SCHOW_LESS = "Show less";
    public static String TEXT_VERIFICATION= "Cuisine: American";
    public static String TEXT_EMAIL = "Email address";
    public static String TEXT_SECTION_FOOD_SCENE = "Restaurants in Innenstadt, Cologne";
    public static String TEXT_CLEAR_ALL = "Clear all";

    /**
     * Constructor injecting the WebDriver interface
     *
     * @param webDriver
     */
    public RestaurantsColognePage(WebDriver webDriver) {
        super(webDriver);
    }

    /*  ELEMENTS  */

    /**
     * show all button locator
     */
    @FindBy(xpath = "//*[@data-qa='show-all-button']")
    static WebElement buttonShow_all;
    @FindBy(xpath = "//*[@data-qa='show-all-button']")
    static WebElement buttonShow_allText;

    /**
     * input Check Box "Cuisine:American"
     */
    @FindBy(xpath = "//li[2]/label/i")
    static WebElement inputCheckBox;
    @FindBy(xpath = "//div[@id='desktop-filters-wrapper']/div/div[2]/div/span")
    static WebElement verificationText;

    /**
     * checking Log in
     */
    @FindBy(xpath = "//div[2]/a")
    static WebElement checkLogin;
    @FindBy(xpath = "//label/div")
    static WebElement emailTabText;

    /**
     * test Food Scene
     */
    @FindBy(xpath = "//div[2]/div/a/img")
    static WebElement btnImgTab;
    @FindBy(xpath = "//h1")
    static WebElement sectionFoodSceneText;

    /**
     * checking btn Outdoor seating
     */
    @FindBy(xpath = "//div[2]/div/div/div/div/button")
    static WebElement btnOutdoorSeating;
    @FindBy(xpath = "//div[2]/div/div/div[2]")
    static WebElement newBtnText;

    /*  METHODS  */


    public void clickOnFilterButton() throws InterruptedException {
        buttonShow_all.click();
        Thread.sleep(5000);
    }
    public String getFilterButtonText() {
        return buttonShow_allText.getText();
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

    public void clickOnButtonImgTab() throws InterruptedException {
        btnImgTab.click();
        Thread.sleep(5000);
    }
    public String getSectionFoodScene(){
        return sectionFoodSceneText.getText();
    }

    public void clickOnOutdoorSeating() throws InterruptedException {
        btnOutdoorSeating.click();
        Thread.sleep(5000);
    }
    public String getNewBtnText(){
        return newBtnText.getText();
    }
}
