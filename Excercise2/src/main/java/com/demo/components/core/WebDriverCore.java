package com.demo.components.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebDriverCore {
  private WebDriver driver;

  public void initialization() {
    Properties properties = new Properties();
    FileInputStream ip;
    try {
      ip = new FileInputStream("src/test/resources/config.properties");
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
    try {
      properties.load(ip);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    String baseURL = properties.getProperty("url");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

    driver.get(baseURL);
  }

  public WebDriver getDriver() {
    return driver;
  }

  public void tearDownMain() {
    driver.quit();
  }
}
