package seleniumwatfordcommunity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WatfordCommunityEdge {
    public static void main( String[] args ) {
        String baseUrl = "https://www.wcht.org.uk/";

        System.setProperty ("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver ();
        driver.get (baseUrl);
        driver.manage ().window ().maximize ();//maximize window
        String getTitle = driver.getTitle ();
        System.out.println (getTitle);
        driver.close ();

    }
}
