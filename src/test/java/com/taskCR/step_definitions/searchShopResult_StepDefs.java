package com.taskCR.step_definitions;

import com.taskCR.pages.SearchShopResultPage;
import com.taskCR.utilities.BrowserUtils;
import com.taskCR.utilities.ConfigurationReader;
import com.taskCR.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class searchShopResult_StepDefs {

    SearchShopResultPage searchShopResultPage = new SearchShopResultPage();
    String expectedLocation = "";

    @Given("User is on the Shop search results page")
    public void user_is_on_the_Shop_search_results_page() {
        String expectedURL = ConfigurationReader.get("expectedURL");
        Driver.get().get(expectedURL);

        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.waitFor(3);
        searchShopResultPage.okayCookie.click();


        String actualResults = searchShopResultPage.showingNumberResults.getText();
        Assert.assertTrue("Verify that results message is showing up", actualResults.contains("results"));

    }

    @When("User enter a {string}")
    public void user_enter_a(String location) {
        BrowserUtils.waitFor(3);
        searchShopResultPage.searchInputBox.sendKeys(location);
        expectedLocation = location.toLowerCase();

    }

    @When("User click the find a shop button")
    public void user_click_the_find_a_shop_button() {
        searchShopResultPage.findShopButton.click();
    }

    @Then("User is able to see a shop in the desired location")
    public void user_is_able_to_see_a_shop_in_the_desired_location() {
        String address = searchShopResultPage.firstRowFirstColumn.getText();
        Assert.assertTrue(address.toLowerCase().contains(expectedLocation));
    }

    @Then("User is not able to see a shop in the desired location")
    public void user_is_not_able_to_see_a_shop_in_the_desired_location() {
        String address = searchShopResultPage.firstRowFirstColumn.getText();
        Assert.assertFalse(address.toLowerCase().contains(expectedLocation));
    }
}
