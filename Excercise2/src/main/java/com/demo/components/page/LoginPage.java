package com.demo.components.page;


import com.demo.components.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
  @FindBy(xpath = "//input[@name='email']")
  private WebElement fieldEmail;
  @FindBy(xpath = "//input[@name='password']")
  private WebElement fieldPassword;

  @FindBy(xpath = "//input[@name='remember']")
  private WebElement checkboxRemember;
  @FindBy(xpath = "//button[@type='submit']")
  private WebElement btnLogin;

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public void enterEmail(String email){
      fieldEmail.sendKeys(email);
  }
  public void enterPassword(String password){
    fieldPassword.sendKeys(password);
  }

  public void clickLoginButton() {
    btnLogin.click();
  }

  public String getPlaceholderEmailField(){
    return fieldEmail.getDomProperty("textContent");
  }

  public String getPlaceholderPasswordField(){
    return fieldPassword.getDomProperty("textContent");
  }

}
