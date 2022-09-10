package myTest;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static pages.RestaurantsColognePage.*;

/**
 *  UI test for search filter https://www.quandoo.de/en/result?destination=koeln&bookable=true
 */
public class RestaurantsCologneTest extends BaseTest {


  @Before
  public void setUp() {
    //open  Restaurants in Cologne page
    driver.get(RESTAURANTS_URL);
    //accept cookies
    restaurantsColognePage.clickAcceptCookiesButton();
  }

   /**
   * opening filter "Cuisine"
   */
  @Test
  public void checkExtensionFilter() throws InterruptedException {
    //click btn Show less
    restaurantsColognePage.clickOnFilterButton();
    //btn changes name
    assertThat(restaurantsColognePage.getFilterButtonText(), containsString(TEXT_SCHOW_LESS));
  }

  /**
   *select American filter in Cuisine filter
   */
  @Test
  public void checkCuisineFilter() throws InterruptedException {
    //click on American Filter in Cuisine filter
    restaurantsColognePage.clickOnInputCheckBox();
    //assert that the first restaurant has American cuisine label
    assertThat(restaurantsColognePage.getVerificationText(), containsString(TEXT_VERIFICATION));
  }

  /**
   * checking button "Log in"
   */
  @Test
  public void checkBtnLogin() throws InterruptedException {
    //click on button
    restaurantsColognePage.clickOnBtnLogin();
    //assert by Text of the transition to another page
    assertThat(restaurantsColognePage.getEmailTabText(), containsString(TEXT_EMAIL));
  }

  /**
   * checking filter Food scene by img
   */
  @Test
  public void checkFoodScene() throws InterruptedException {
    //click on img in Food scene filter
    restaurantsColognePage.clickOnButtonImgTab();
    //assert by Text
    assertThat(restaurantsColognePage.getSectionFoodScene(), containsString(TEXT_SECTION_FOOD_SCENE));
  }

  /**
   * checking button filter Outdoor seating
   */
  @Test
  public void checkBtnOutdoorSeating() throws InterruptedException {
    //click filter Outdoor seating
    restaurantsColognePage.clickOnOutdoorSeating();
    //added button "Clear all"
    assertThat(restaurantsColognePage.getNewBtnText(), containsString(TEXT_CLEAR_ALL));
  }
}

