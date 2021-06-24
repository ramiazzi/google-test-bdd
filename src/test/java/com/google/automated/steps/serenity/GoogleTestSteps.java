package com.google.automated.steps.serenity;


import com.google.automated.pages.GoogleHomePage.GoogleHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class GoogleTestSteps extends ScenarioSteps {

  GoogleHomePage googleHomePage;

  @Step
  public void goToHomePage(){
    googleHomePage.goToHomePage();
  }

    @Step
  public boolean isHomePageDisplayed(){
   return googleHomePage.isHomePageDisplayed();
  }

   @Step
  public void searchKeyword(String keyword){
    googleHomePage.searchKeyword(keyword);
  }

   @Step
  public void clickOnFirstResult(){
    googleHomePage.clickOnFirstResult();
  }

}