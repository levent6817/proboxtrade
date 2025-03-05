package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //LeftSide MenuBar Category Navigation

    @FindBy(xpath = "//a[@href='/sign-up']")
    public static WebElement SignUpButton;

    @FindAll(@FindBy(xpath = "//li[@class='MuiListItem-root MuiListItem-gutters css-19kxtar']"))
    public List<WebElement> categoryMenu;

    @FindBy(xpath = "//span[.='Woman's Fashion']")
    public WebElement womanFashion;

    @FindBy(xpath = "//span[.='Men's Fashion']")
    public WebElement menFashion;

    @FindBy(xpath = "//span[.='Electronics']")
    public WebElement electronics;

    @FindBy(xpath = "//span[.='Home & Lifestyle']")
    public WebElement homeAndLifestyle;

    @FindBy(xpath = "//span[.='Medicine']")
    public WebElement medicine;

    @FindBy(xpath = "//span[.='Sports & Outdoor']")
    public WebElement sportsAndOutdoor;

    @FindBy(xpath = "//span[.='Baby's & Toys']")
    public WebElement babyAndToys;

    @FindBy(xpath = "//span[.='Groceries & Pets']")
    public WebElement groceriesAndPets;

    @FindBy(xpath = "//span[.='Health & Beauty']")
    public WebElement healthAndBeauty;


    //Categories-Browse By Category

    @FindBy(xpath = "//h6[.='Phones']")
    public WebElement phones;

    @FindBy(xpath = "//h6[.='Computers']")
    public WebElement computers;

    @FindBy(xpath = "//h6[.='SmartWatch']")
    public WebElement smartWatch;

    @FindBy(xpath = "//h6[.='Camera']")
    public WebElement camera;

    @FindBy(xpath = "//h6[.='HeadPhones']")
    public WebElement headPhones;

    @FindBy(xpath = "//h6[.='Gaming']")
    public WebElement gaming;

}