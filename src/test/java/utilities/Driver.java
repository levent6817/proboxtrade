package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    //Constructor
    private Driver(){}


    public static WebDriver getDriver(){
        if(driverThread.get() ==null){
            String browser =ConfigReader.getProperty("browser");

            switch (browser){
                case "edge":
                    driverThread.set(new EdgeDriver());
                    break;
                case "firefox":
                    driverThread.set(new FirefoxDriver());
                    break;
                case "headless":
                    driverThread.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
                    break;
                default:
                    driverThread.set(new ChromeDriver());
            }
            getDriver().manage().window().maximize();
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return  driverThread.get();

    }

    public static void closeDriver(){
        if (driverThread.get()!=null){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driverThread.get().quit();
            driverThread.remove();
        }
    }
}
