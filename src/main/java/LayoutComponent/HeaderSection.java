package LayoutComponent;

import AbstractComponent.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderSection extends AbstractComponent {


    public HeaderSection(WebDriver driver, WebElement sectionElement, WebDriverWait wait) {
        super(driver, sectionElement, wait);
    }

    public void clickLoginButton() {


    }

}
