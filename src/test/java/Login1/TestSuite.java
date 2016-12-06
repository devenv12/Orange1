package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Dev on 19/11/2016.
 */
public class TestSuite extends BasicTest {

    Utility utl = new Utility();

    @Test

    public void openHomePage()
    {
        Assert.assertEquals(driver.findElement(By.id("btnLogin")).getAttribute("value"),"LOGIN");
        System.out.println("Pass");
    }


    @Test

    public void userShouldLogIn()
    {
        utl.enter(By.id("txtUsername"),"Admin");
        utl.enter(By.id("txtPassword"),"admin");
        utl.click1(By.id("btnLogin"));
        Assert.assertEquals(driver.findElement(By.id("welcome")).getText(),"Welcome Admin");
        System.out.println("Pass");



    }


    @Test

    public void userShouldLogOut() throws InterruptedException {
        utl.enter(By.id("txtUsername"),"Admin");
        utl.enter(By.id("txtPassword"),"admin");
        utl.click1(By.id("btnLogin"));

//        utl.select(By.id("welcome"),("Welcome Admin"));
        WebDriverWait wait = new WebDriverWait(driver,50);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("welcome")));
//        utl.wait1(By.id("welcome"));
//        utl.click1(By.id("welcome"));
        element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));

        utl.click1(By.linkText("Logout"));
        Assert.assertEquals(driver.findElement(By.id("logInPanelHeading")).getText(),"LOGIN Panel" );
        System.out.println("Pass");

    }


}