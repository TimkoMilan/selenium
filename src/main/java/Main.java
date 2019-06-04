import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    @Test
    public void test() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\milan.timko\\Documents\\selenium\\chromedriver.exe");
//        System.setProperty("webdriver.", "C:\\Users\\milan.timko\\Documents\\selenium\\chromedriver.exe");

        WebDriver driver = new FirefoxDriver();
//        driver.get("http://www.google.com");
//        driver.manage().window().maximize();
//
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("abcd");
//        driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]")).click();
//        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[5]/div/span[1]/div/table/tbody/tr/td[3]/a")).click();
//
//        driver.quit();


        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).sendKeys("name");
//        driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys("lastName");
//        Select select = new Select(driver.findElement(By.id("month")));
//        select.selectByIndex(2);
//        new Select(driver.findElement(By.id("day"))).selectByValue("20");
//        new Select(driver.findElement(By.id("year"))).selectByValue("1983");
//        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div/div/div[1]/h2")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div/div/div[1]/h2")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div/div/div[1]/h2")).getSize());
        WebElement webElement = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div/div/div[1]/h2"));
        Point point = webElement.getLocation();
        System.out.println("location " + point.toString());


//        driver.quit();

    }
}
