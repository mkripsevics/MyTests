import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {
    private WebDriver driver;

    @Before
    public void setup() {
        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Create ChromeDriver instance with ChromeOptions
        driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test
    public void web() {
        driver.get("https://www.google.com");
        // Add your test logic here
    }

    @After
    public void teardown() {
        // Quit the driver
        if (driver != null) {
            driver.quit();
        }
    }
}

