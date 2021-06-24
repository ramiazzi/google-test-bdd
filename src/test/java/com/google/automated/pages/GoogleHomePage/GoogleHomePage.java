package com.google.automated.pages.GoogleHomePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GoogleHomePage extends PageObject {

  @FindBy(xpath = ".//input[@class='gLFyf gsfi']")
  private WebElementFacade searchbar;
    @FindBy(xpath = ".//center/input[@class='gNO89b']")
  private WebElementFacade searchbutton;

  @FindBy(xpath =".//a/div[@class='TbwUpd NJjxre']/cite[@class='iUh30 Zu0yb tjvcx']")
  private WebElementFacade firstResult;

  @FindBy(xpath =".//span/div/div/div[2]")
  private WebElementFacade popup;

  @FindBy(xpath =".//span/div/div/div[3]/button[2]/div")
  private WebElementFacade acceptButton;

  public void goToHomePage() {
    getDriver().get("http://google.fr");
    waitABit(1000);
    // click on accept button inside popup
    if (popup.isPresent()){
      acceptButton.click();
    }
  }

  public boolean isHomePageDisplayed() {
    return searchbar.isPresent();
  }

  public void searchKeyword(String word) {
    searchbar.click();
    searchbar.sendKeys(word);
    searchbutton.click();
  }

    public void clickOnFirstResult() {
    firstResult.click();
  }
}
