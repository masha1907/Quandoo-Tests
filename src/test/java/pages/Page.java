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

  // constant url
  protected static String BASE_URL = "https://www.quandoo.de";
  /*
   * Constructor injecting the WebDriver interface
   *
   * @param webDriver
   */
  public Page(WebDriver driver) {
    Page.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy (id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
  static WebElement acceptCookies;


  public void clickAcceptCookiesButton () {
    acceptCookies.click();
  }
}
