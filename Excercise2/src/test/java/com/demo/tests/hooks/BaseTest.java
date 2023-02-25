package com.demo.tests.hooks;

import com.demo.components.core.WebDriverCore;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
  protected WebDriverCore webDriver = new WebDriverCore();

  @Before
  public void beforeTest() {
    webDriver.initialization();
  }

  @After
  public void afterTest() {
    webDriver.tearDownMain();
  }

}
