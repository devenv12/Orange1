package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

/**
 * Created by Dev on 19/11/2016.
 */
public class Utility extends BasePage {

    public void enter(By by, String text)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public void click1(By by)
    {
        driver.findElement(by).click();
    }

    public void wait1(By by)
    {
        WebDriverWait wait = new WebDriverWait(driver,50);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void select(By by,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public void screenshot()
    {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//        FileUtils.copyFile(scrFile, new File("C:\\Users\\Dev\\screenshot999.png"));
    }
//    public String gettext(By by)
//    {
//
//    }
}

