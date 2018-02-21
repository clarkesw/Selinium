import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by cxs6343 on 11/30/2017.
 */
public class WebDriverDemo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///D:\\Java\\GitHub\\Selinium\\src\\main\\TestFile.html");

        List<WebElement> element = driver.findElements(By.name("color"));
        for(WebElement ele: element){
            System.out.println(ele.getAttribute("value")+"  "+ele.isSelected());
        }

        Select check = new Select(driver.findElement(By.id("select1")));
        List<WebElement> checklist = check.getOptions();

        WebElement outterTable =  driver.findElement(By.xpath("//td/table/tbody/tr[2]/td"));
        System.out.println(outterTable.getText());
    }
}

//    WebElement outterTable =  driver.findElement(By.tagName("table"));
//    WebElement innerTable =  outterTable.findElement(By.tagName("table"));
//    List<WebElement> row = innerTable.findElements(By.tagName("td"));
//        for (WebElement myEle : row){
//                System.out.println("row: " + myEle.getText());
//                }


//        driver.get("http://www.yahoo.com");
//
//                WebElement element = driver.findElement(By.cssSelector("input[id='uh-search-box']"));
//                driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//
//                element.sendKeys("surf");