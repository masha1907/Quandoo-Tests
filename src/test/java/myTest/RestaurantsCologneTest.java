package myTest;// Generated by Selenium IDE

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static pages.RestaurantsColognePage.*;

public class RestaurantsCologneTest extends BaseTest {


  @Before
  public void setUp() {
    driver.get(RESTAURANTS_URL);
    Dimension dimension = new Dimension(1280, 796);
    driver.manage().window().setSize(dimension);
    restaurantsColognePage.clickAcceptCookiesButton();
  }

  // Navigation tab menu tests:

  @Test
  public void checkExtensionFilter() throws InterruptedException {

    restaurantsColognePage.clickOnFilterButton();
    assertThat(restaurantsColognePage.getFilterButtonText(), containsString(TEXT_SCHOW_LESS));
  }

  @Test
  public void checkCuisineFilter() throws InterruptedException {

    restaurantsColognePage.clickOnInputCheckBox();
    assertThat(restaurantsColognePage.getVerificationText(), containsString(TEXT_VERIFICATION));
  }

  @Test
  public void checkBtnLogin() throws InterruptedException {

    restaurantsColognePage.clickOnBtnLogin();
    assertThat(restaurantsColognePage.getEmailTabText(), containsString(TEXT_EMAIL));
  }



}

