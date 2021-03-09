package com.taskCR.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchShopResultPage extends BasePage {

    @FindBy(css = "[id='main-content'] >h1")
    public WebElement pageTitle;

    @FindBy(css = "[id='edit-field-shop-geocode-latlon']")
    public WebElement searchInputBox;

    @FindBy(id = "edit-submit-shop-listing")
    public WebElement findShopButton;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement firstRowFirstColumn;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement okayCookie;

    @FindBy(xpath = "//div[@class='results-title']")
    public WebElement showingNumberResults;

}
