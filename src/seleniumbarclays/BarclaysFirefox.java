package seleniumbarclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BarclaysFirefox {
    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver =  new FirefoxDriver ();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();
    }
}
