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

    //Header Navbar Menu
    @FindBy(xpath = "//button[.='ShopNow']")
    public static WebElement shopNowButton;

    @FindBy(xpath = "//*[.='English']")
    public static WebElement languageListBox;

    @FindBy(xpath = "//a[.='Exclusive']")
    public static WebElement exclusiveButton;

    @FindBy(xpath = "//a[@href='/home']")
    public static WebElement homeButton;

    @FindBy(xpath = "//a[@href='/contact']")
    public static WebElement contactButton;

    @FindBy(xpath = "//a[@href='/about']")
    public static WebElement aboutButton;

    @FindBy(xpath = "//a[@href='/sign-up']")
    public static WebElement signUpButton;

    @FindBy(xpath = "//input[@class='MuiInputBase-input css-aae3xl']")
    public static WebElement searchBar;

    @FindBy(xpath = "//*[@data-testid='FavoriteBorderOutlinedIcon']")
    public static WebElement allFavoriteIcon;

    @FindBy(xpath = "//*[@data-testid='ShoppingCartOutlinedIcon']")
    public static WebElement shoppingCartIcon;


    //LeftSide MenuBar Category Navigation
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

    //Product Card
    @FindAll(@FindBy(xpath = "//button[.='Add To Cart']"))
    public List<WebElement> addToCartButton;

    @FindAll(@FindBy(xpath = "//*[@data-testid='FavoriteIcon']"))
    public List<WebElement> favoriteIcon;

    @FindAll(@FindBy(xpath = "//*[@data-testid='VisibilityIcon']"))
    public List<WebElement> visibilityIcon;

    @FindAll(@FindBy(xpath = "//p[contains(@class,'css-rvr1xv')]"))
    public List<WebElement> productName;

    @FindAll(@FindBy(xpath = "//p[contains(@class,'css-1rh31si')]"))
    public List<WebElement> productNewPrice;

    @FindAll(@FindBy(xpath = "//p[contains(@class,'css-ur63k9')]"))
    public List<WebElement> productOldPrice;

    @FindAll(@FindBy(xpath = "//span[contains(@class,'css-1dp2a72')]"))
    public List<WebElement> ratingStars;

    @FindAll(@FindBy(xpath = "//p[contains(@class,'css-172okca')]"))
    public List<WebElement> ratingNumbers;

    //Flash Sales & Our Products
    @FindAll(@FindBy(xpath = "//button[.='View All Products']"))
    public List<WebElement> viewAllProductsButton;

    //Best Selling Products
    @FindBy(xpath = "//button[.='View All Products']")
    public WebElement viewAllButton;


}