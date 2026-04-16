package pages;
import org.openqa.selenium.*;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver d){ driver=d; }
    By user=By.id("username");
    By pass=By.id("password");
    By login=By.id("submit");
    By title=By.tagName("title");

    public void open(String url){
        System.out.println("Driver is yet to launch web browser");
        driver.get(url);
        System.out.println("commit-178-Rebase");
        System.out.println("commit-254-Rebase");
        System.out.println("commit-32-Rebase");
        System.out.println("commit-67-Rebase");
        System.out.println("commit-55-Rebase");
        System.out.println("commit-9-Rebase");

    }

    public void login(String u,String p){
        driver.findElement(user).sendKeys(u);
        driver.findElement(pass).sendKeys(p);
        driver.findElement(login).click();
    }
    public String title() {
      try{
          Thread.sleep(10000);
      }catch(Exception e){
      }
        return driver.getTitle();
    }
}