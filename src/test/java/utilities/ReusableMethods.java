package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class ReusableMethods {

    // protected AllElements elements = new AllElements();
    protected Faker faker = new Faker();


    public static String addDays(LocalDate date, int days) {
        DateTimeFormatter myDateObj = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String dateBefore = myDateObj.format(date);

        // create instance of the SimpleDateFormat that matches the given date
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        //create instance of the Calendar class and set the date to the given date
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(sdf.parse(dateBefore));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // use add() method to add the days to the given date
        cal.add(Calendar.DAY_OF_MONTH, days);
        String dateAfter = sdf.format(cal.getTime());
        return dateAfter;
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        return date;
    }


    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //===============Explicit Wait==============//

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    //login
    public static void login(String username, String password) {

        Driver.getDriver().findElement(By.cssSelector("[href='/api/login']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(username);
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }

    // logout
    public static void logout() {
        // Driver.getDriver().findElement(By.cssSelector("[href='/api/logout']")).click();
    }

    //this method will clear text box
    public static void cleanTextInBox(WebElement element) {
        String inputText = element.getAttribute("value");
        if (inputText != null) {
            for (int i = 0; i < inputText.length(); i++) {
                element.sendKeys(Keys.BACK_SPACE);
            }
        }
    }

    //Scrolls down to an element using JavaScript
    public static void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView({block: \"center\",inline: \"center\",behavior: \"smooth\"});", element);
    }

}
