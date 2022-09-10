package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

  public static WebDriver driver;

  /**
   *  constant url
   */
  protected static String BASE_URL = "https://www.quandoo.de";

  /**
   * Constructor injecting the WebDriver interface
   */
  public Page(WebDriver driver) {
    Page.driver = driver;
    PageFactory.initElements(driver, this);
  }

  /**
   * locator valid for all tests
   */
  @FindBy (id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
   static WebElement acceptCookies;

  /**
   *  this method makes a click on cookies
   */
  public void clickAcceptCookiesButton () {
    acceptCookies.click();
  }
}
