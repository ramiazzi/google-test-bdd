package com.google.automated.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

  public static void switchTab(WebDriver driver) {
    java.util.Set<String> tab = driver.getWindowHandles();
    if (tab.size() != 0) {
      driver.switchTo().window(tab.toArray()[tab.size() - 1].toString());
    }
  }

  public static void navigateToURL(String Url, WebDriver driver) {
    driver.navigate().to(Url);
  }

}
