import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    private WebDriver driver;

    @Test
    public void helloSelenium() {
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");

        String currentUrl  = driver.getCurrentUrl();
        String expected = "http://www.automationpractice.pl/index.php";

        Assertions.assertEquals(expected, currentUrl);

        //driver.quit();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
