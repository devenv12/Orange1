package Login1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dev on 19/11/2016.
 */
public class BasicTest extends BasePage{
    @BeforeMethod

    public void open()
    {
        driver = new FirefoxDriver();
        driver.get("http://opensource.demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
@AfterMethod



    public void close()
    {
      driver.quit();
    }



}

