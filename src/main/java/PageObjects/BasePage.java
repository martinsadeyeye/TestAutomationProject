package PageObjects;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends AbstractComponent {
    public BasePage(WebDriver driver, WebElement sectionElement, WebDriverWait wait) {
        super(driver, sectionElement, wait);
    }


    public void doClick(By locator) {
        driver.findElement(locator).click();
    }

    public void doSendKeys(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void doGetText(By locator) {
        driver.findElement(locator).getText();
    }


}
