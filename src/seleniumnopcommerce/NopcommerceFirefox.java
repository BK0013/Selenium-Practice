package seleniumnopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopcommerceFirefox {
    public static void main(String[] args) {
        String baseUrl = "https://www.nopcommerce.com/demo";
        //String baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver =  new FirefoxDriver ();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
         driver.close();
    }
}
