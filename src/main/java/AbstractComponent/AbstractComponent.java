package AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AbstractComponent {

    public WebDriver driver;
    public WebElement sectionElement;
    public WebDriverWait wait;


    public AbstractComponent(WebDriver driver, WebElement sectionElement, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.sectionElement = sectionElement;
    }



    public WebElement findElement(By findElement) {

        return sectionElement.findElement(findElement);
    }

    public List<WebElement> findElements(By findElement) {

        return sectionElement.findElements(findElement);
    }

    public void waitForElementToDisappear(By findBy) {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
    }




}
