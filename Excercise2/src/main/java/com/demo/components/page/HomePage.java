package com.demo.components.page;

import com.demo.components.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
  @FindBy(xpath = "//h1[text()='Dashboard']")
  private WebElement titleDashboard;

  public HomePage(WebDriver driver) {
    super(driver);
  }

  public boolean isOnTheHomepage(){
    return titleDashboard.isDisplayed();
  }

}
