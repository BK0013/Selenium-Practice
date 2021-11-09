package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class EdgeBrowserTest {
    public static void main( String[] args ) {
        String baseUrl = "https://www.amazon.co.uk/";

        System.setProperty ("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver ();
        driver.get (baseUrl);
        driver.manage ().window ().maximize ();//maximize window
        String getTitle = driver.getTitle ();
        System.out.println (getTitle);
        driver.close ();

    }
}

