import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementsTest {


    @Test
    public void basics()  {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

         driver.get("https://demoqa.com/webtables");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//*[@id='edit-record-1']")).click();
         driver.findElement(By.cssSelector("#age")).clear();
         driver.findElement(By.cssSelector("#age")).sendKeys("20");
         driver.findElement(By.xpath("//*[@id='submit']")).click();
         System.out.println(driver.findElement(By.xpath("//div[@class='rt-tr-group']/div/div[3]")).getText());


         driver.findElement(By.xpath("//*[@id='edit-record-2']")).click();
         System.out.println(driver.findElement(By.xpath("//div[@class='rt-tr-group']/div/div[4]")).getText());

        System.out.println(driver.findElement(By.xpath("//div[@class='rt-tr-group']/div/div[3]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='rt-tbody']/div[2]/div/div[3]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='rt-tbody']/div[3]/div/div[3]")).getText());

        driver.quit();

    }


}
