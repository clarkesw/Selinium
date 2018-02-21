
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNg {

    private static WebDriver driver = null;

    @BeforeClass
    public static void startWebdriver() {
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void testCase() {
        driver.get("http://www.google.com");
        System.out.println("Title : " + driver.getTitle());
        System.out.println("Url : " + driver.getCurrentUrl());
        try {
            Thread.sleep(3000);
        } catch (Exception e) {	}
        driver.get("http://www.youtube.com");
        System.out.println("Title : " + driver.getTitle());
        System.out.println("Url : " + driver.getCurrentUrl());
    }


    @AfterClass
    public static void stopWebdriver() {
        if(driver != null)
            driver = null;

    }



}
