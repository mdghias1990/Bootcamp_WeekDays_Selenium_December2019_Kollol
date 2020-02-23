package testhomepage;

import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class TestHomePage extends HomePage {

    public static void getInItElements() {
        PageFactory.initElements(driver, HomePage.class);
    }
// Validate
    @Test
    public void testTopHeaderTag() throws InterruptedException {
        getInItElements();
        validatePracticePage();
        sleepFor(2);
    }
//Click
    @Test
    public static void clickon() throws InterruptedException {
        driver.findElement(By.xpath(xpathSignUp)).click();
        sleepFor(2);
    }
    //Click
    @Test(priority = 1)
    public static void testPracticeButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
    }
//ClassBar Click
    @Test(priority = 2)
    public static void testSelectClassBar() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        clickSelectClassBar();
        sleepFor(2);
    }
//Radio Button
    @Test(priority = 3)
    public static void clickOnRadioButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        clickRadioButton();
        sleepFor(2);

    }
//Drop down Select
    @Test(priority = 4)
    public static void clickOnSelectButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        selectFromDrop(webElemetSelectButton, "benz");
        sleepFor(3);

    }
// Select multiButton
    @Test(priority = 5)
    public static void clickOnSelectMultiButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        selectFromMultipleDrop(webElemetSelectMultiButton, "apple", "orange");
        sleepFor(3);

    }
// Click on Check Button
    @Test(priority = 6)
    public static void clickOnCheckButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        checkButton();
        sleepFor(3);

    }
// newWindow open
    @Test(priority = 7)
    public static void newWindowOpen() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        newTabOpen();
        handleNewTab(driver).close();
        sleepFor(3);
    }
//
    @Test(priority = 8)
    public static void newWindowOpen1() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        newTabOpen1();
        handleNewTab(driver).close();
        sleepFor(3);

    }

    @Test(priority = 9)
    public static void alertHandleAccept() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        searchBoxSend();
        for (int i = 0; i < namelist().size(); i++) {
            System.out.println(namelist());
        }
        alertNewHandle();
        sleepFor(2);
        okAlert();

    }

    @Test(priority = 10)
    public static void alertHandleCancle() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        alertNewHandle();
        sleepFor(2);
        cancelAlert();
    }

    @Test(priority = 11)
    public static void getTable() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        scrollUpDown(2500);
        getListOfWebElementsByXpath(webElemetTable);
        sleepFor(2);

    }

    @Test(priority = 12)
    public void testiFrame() throws InterruptedException {
        getInItElements();
        //clickPracticeButton();
        scrollUpDown(1100);
        iframeHandle(iFrameName);
        sleepFor(2);

        useSearchbar("python");
        sleepFor(2);
        clearSearchBar();
        sleepFor(2);
    }


}
