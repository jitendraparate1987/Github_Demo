package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverFactory {
    static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static void init(){
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
    }
    public static WebDriver get(){ return driver.get(); }
    public static void quit(){ driver.get().quit(); }
}