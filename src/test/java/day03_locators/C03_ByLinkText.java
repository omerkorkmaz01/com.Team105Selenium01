package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) {

    // amazon anasayfaya gidin
    // Gift Cards linkini tiklayin
    // Gift Cards sayfasina gittigini test edin

    System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().window().maximize();

    driver.get("https://amazon.com");

        WebElement giftCardLinki= driver.findElement(By.linkText("Today's Deals"));
        giftCardLinki.click();

        // istenen sayfaya gittigini test etmek icin
        // title'in Gift Card icerdigini test edebiliriz

        String exceptedKelime="Gift Cards";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(exceptedKelime)) {
            System.out.println("Gift Cards testi PASSED");
        }else {
            System.out.println("Gift Cards testi FAILED");
        }

    }
}
