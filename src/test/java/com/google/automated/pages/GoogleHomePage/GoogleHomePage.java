package com.google.automated.pages.GoogleHomePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import com.google.automated.model.Browser;

public class GoogleHomePage extends PageObject {

  @FindBy(xpath = ".//input[@class='gLFyf gsfi']")
  private WebElementFacade searchbar;
    @FindBy(xpath = ".//center/input[@class='gNO89b']")
  private WebElementFacade searchbutton;

  @FindBy(xpath =".//a/div[@class='TbwUpd NJjxre']/cite[@class='iUh30 Zu0yb tjvcx']")
  private WebElementFacade firstResult;

  public void goToHomePage() {
    getDriver().get("http://google.fr");
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
