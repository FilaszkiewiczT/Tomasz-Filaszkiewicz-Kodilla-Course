package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public final static String XPATH_WAIT_FOR = "//select[3]";
    public final static String XPATH_DAY = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    public final static String XPATH_MONTH = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    public final static String XPATH_YEAR = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");
        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoardDay = new Select(selectComboDay);
        selectBoardDay.selectByIndex(12);

        WebElement selectComboDayMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoardMonth = new Select(selectComboDayMonth);
        selectBoardMonth.selectByIndex(06);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByValue("2018");

    }
}