package com.demo.tests.steps;

import com.demo.components.page.HomePage;
import com.demo.components.page.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SessionSteps {

  public void doLogin(WebDriver driver, String email, String password) {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.enterEmail(email);
    loginPage.enterPassword(password);
    loginPage.clickLoginButton();
  }

  public void loginSuccessful(WebDriver driver) {
    HomePage homePage = new HomePage(driver);
    Assert.assertTrue(homePage.isOnTheHomepage());
  }

  public void emailPlaceholderAppearCorrect(WebDriver driver) {
    LoginPage loginPage = new LoginPage(driver);
    Assert.assertEquals(loginPage.getPlaceholderEmailField(),"Email");
  }

  public void passwordPlaceholderAppearCorrect(WebDriver driver) {
    LoginPage loginPage = new LoginPage(driver);
    Assert.assertEquals(loginPage.getPlaceholderPasswordField(),"Password");
  }
}
