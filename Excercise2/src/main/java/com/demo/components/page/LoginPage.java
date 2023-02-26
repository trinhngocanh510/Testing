package com.demo.components.page;

import com.demo.components.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
  @FindBy(xpath = "//input[@name='email']")
  private WebElement fieldInputEmail;

  @FindBy(xpath = "//input[@name='password']")
  private WebElement fieldInputPassword;

  @FindBy(xpath = "//input[@name='email']/following-sibling::span")
  private WebElement fieldPlaceholderEmail;

  @FindBy(xpath = "//input[@name='password']/following-sibling::span")
  private WebElement fieldPlaceholderPassword;

  @FindBy(xpath = "//input[@name='remember']")
  private WebElement checkboxRemember;

  @FindBy(xpath = "//button[@type='submit']")
  private WebElement btnLogin;

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public void enterEmail(String email) {
    fieldInputEmail.sendKeys(email);
  }

  public void enterPassword(String password) {
    fieldInputPassword.sendKeys(password);
  }

  public void clickLoginButton() {
    btnLogin.click();
  }

  public String getPlaceholderEmailField() {
    return fieldPlaceholderEmail.getDomProperty("textContent").trim();
  }

  public String getPlaceholderPasswordField() {
    return fieldPlaceholderPassword.getDomProperty("textContent").trim();
  }

  public boolean isRememberChecked() {
    return checkboxRemember.isSelected();
  }

  public void clickRememberCheckbox(WebDriver driver) {
    WebElement checkbox = driver.findElement(By.xpath("//input[@name='remember']/.."));
    checkbox.click();
  }
}
