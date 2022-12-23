package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        // Biz browser'lari olusturdugumuz driver sayesinde otomate edebiliyoruz
        // Bunun icin her testin basinda mutlaka driver objesi olusturacağiz

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        // acilan sayfanin basliginin amazon icerdigini test edin

        String expectedKelime = "amazon";
        String actualResult = driver.getTitle();

        if (actualResult.contains(expectedKelime)) {
            System.out.println("Title testi passed");
        } else {
            System.out.println("Title amazon icermiyor, test failed");
            System.out.println(driver.getTitle());
        }


        // gitigimiz sayfanin URL'in in htps://www.amazon.com/ oldugunu test edin

        String exceptedURL = "htps://www.amazon.com/";
        String actualURL = driver.getCurrentUrl();

        if (exceptedURL.equals(actualURL)){
        System.out.println("URL testi passsed");
    }else {
            System.out.println("URL istedigimiz degerde degil");
            System.out.println(driver.getCurrentUrl());
        }

        Thread.sleep(5000);

        driver.close();
    }
}
