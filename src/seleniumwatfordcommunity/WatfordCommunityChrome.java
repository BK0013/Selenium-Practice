package seleniumwatfordcommunity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WatfordCommunityChrome {
    public static void main( String[] args ) {
        String baseUrl = "https://www.wcht.org.uk/";

        System.setProperty ("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        driver.get (baseUrl);
        driver.manage ().window ().maximize ();//maximize window
        String getTitle =  driver.getTitle ();
        System.out.println (getTitle);
        driver.close ();

    }
}
