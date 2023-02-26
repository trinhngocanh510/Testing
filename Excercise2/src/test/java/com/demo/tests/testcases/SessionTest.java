package com.demo.tests.testcases;

import com.demo.components.constants.Constants;
import com.demo.tests.hooks.BaseTest;
import com.demo.tests.steps.SessionSteps;
import org.junit.Test;

public class SessionTest extends BaseTest {

  @Test
  public void loginSuccessful() {
    SessionSteps sessionSteps = new SessionSteps();
    sessionSteps.doLogin(webDriver.getDriver(), Constants.email, Constants.password);
    sessionSteps.loginSuccessful(webDriver.getDriver());
  }

  @Test
  public void checkUI() {
    SessionSteps sessionSteps = new SessionSteps();
    sessionSteps.emailPlaceholderAppearCorrect(webDriver.getDriver());
    sessionSteps.passwordPlaceholderAppearCorrect(webDriver.getDriver());
    sessionSteps.rememberChecked(webDriver.getDriver());
  }
}
