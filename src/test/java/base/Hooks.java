package base;
import io.cucumber.java.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import utils.DriverFactory;
import java.io.ByteArrayInputStream;
public class Hooks {
    @Before
    public void setup(){ DriverFactory.init(); }
    @After
    public void tearDown(Scenario s){
        if(s.isFailed()){
            byte[] ss = ((TakesScreenshot)DriverFactory.get()).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failure Screenshot",new ByteArrayInputStream(ss));
        }
        DriverFactory.quit();
    }
}