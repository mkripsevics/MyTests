import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CarrentersLoginTest {
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
        // Navigate to the Facebook login page
        driver.get("https://www.carrenters.is/");

        // Sleep for a while to observe the result (you can replace this with proper synchronization)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate the login button and click on it
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        // Locate the email/phone input field and enter your email or phone number
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("martins.kripsevics@gmail.com");

        // Locate the password input field and enter your password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Kr1p$ev1cs13");

        // Locate the login button and click on it
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        // Sleep for a while to observe the result (you can replace this with proper synchronization)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void teardown() {
        try {
            // Quit the driver
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception as needed
        }
    }
}
