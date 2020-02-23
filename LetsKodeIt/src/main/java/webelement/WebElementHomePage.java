package webelement;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class WebElementHomePage  extends WebAPI {

    public static final String xpathPractice = "//h1[contains(text(),'Practice Page')]";
    @FindBy(how = How.XPATH, using = xpathPractice)
    public static WebElement practic;

    public static final String xpathSignUp = "//a[@id='header-sign-up-btn']";
    @FindBy(how = How.XPATH, using = xpathSignUp)
    public static WebElement signUp;

    public static final String xpathUserName = "//input[@id='user_name']";
    @FindBy(how = How.XPATH, using = xpathUserName)
    public static WebElement userName;

 public static final String xpathEmail = "//input[@id='user_email']";
    @FindBy(how = How.XPATH, using =xpathEmail )
    public static WebElement email ;
 public static final String xpathPassword = "//input[@id='user_password']";
    @FindBy(how = How.XPATH, using =xpathPassword )
    public static WebElement password;
public static final String xpathConfirmPassword = "//input[@id='user_password_confirmation']";
    @FindBy(how = How.XPATH, using =xpathConfirmPassword )
    public static WebElement confirmPassword;
public static final String xpathEmailNotificationPermissionButton = "//input[@id='user_unsubscribe_from_marketing_emails']";
    @FindBy(how = How.XPATH, using =xpathEmailNotificationPermissionButton )
    public static WebElement emailNotificationPermissionButton;

public static final String xpathTermConditionRadioButton = "//input[@id='user_agreed_to_terms']";
    @FindBy(how = How.XPATH, using =xpathTermConditionRadioButton )
    public static WebElement termConditionRadioButton;

public static final String xpathSignUpButton = "//form[@id='new_user']//center";
    @FindBy(how = How.XPATH, using = xpathSignUpButton)
    public static WebElement signUpButton;
//
//public static final String xpathUserName = "";
//    @FindBy(how = How.XPATH, using = )
//    public static WebElement ;



    // from shuvro
    public static final String xPathPractice="//a[@class='fedora-navbar-link navbar-link']";
    public static final String xPathSelectClassBar="//select[@id='carselect']";
    public static final String webElemetRadioButton = "//input[@id='bmwradio']";
    public static final String webElemetSelectButton = "//select[@id='carselect']";
    public static final String webElemetSelectMultiButton = "//select[@id='multiple-select-example']";
    public static final String webElemetSelectCheckBox = "//input[@id='bmwcheck']";
    public static final String webElemetOpenNewTab = "//button[@id='openwindow']";
    public static final String webElemetOpenNewTab1 = "//a[@id='opentab']";
    public static final String webElemetAlertHandle = "//input[@id='confirmbtn']";
    public static final String webElemetSearchBox = "//input[@id='name']";
    public static final String webElemetAlert = "//input[@id='alertbtn']";
    public static final String webElemetTable = "//table[@id='product']";
    public static final String webElemetIframeSearchBar = "//input[@id='search-courses']";//input[@id='search-courses']
    public static final String webElemetIframeName = "//iframe[@id='courses-iframe']";

}