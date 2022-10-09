import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class trelloTest {

    public static <string> void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Atakan/Selenium/Chromedriver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://trello.com/u/rakelranold/boards");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p/a")).click();

        driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("rakelranold1@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("ATAkan200:");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#login-submit > span")).click();

       Thread.sleep(2500);


       driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/ul/li/div")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/section/div/form/div[1]/label/input")).sendKeys("TEstinium");//create a board
         Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[3]/div/section/div/form/button")).click();

        Thread.sleep(2500);


        driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[1]/div/textarea")).sendKeys("TEstKart");// create a card

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[2]/div[1]/input")).click();

        Thread.sleep(1000);

        WebElement crother=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/main/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div/textarea"));// create other card

        crother.sendKeys("KArt");


        Thread.sleep(1200);

       driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/a[1]")).click();

        Thread.sleep(1200);

       driver.findElement(By.xpath("//*[@id=\"chrome-container\"]/div[3]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div[3]/textarea")).sendKeys("güncelle");// update a card

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"chrome-container\"]/div[3]/div/div/div/div[4]/div[2]/div/div/div/div[2]/div/div/div[3]/div/input[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"chrome-container\"]/div[3]/div/div/a")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[1]/div[2]/a")).click();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#chrome-container > div.pop-over.is-shown > div > div:nth-child(2) > div > div > div > ul:nth-child(6) > li:nth-child(2) > a")).click();//Arşivle

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"chrome-container\"]/div[4]/div/div[2]/div/div/div/input")).click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/div[4]/span[11]/div/button/span/span")).click();//Arşivlenmiş öğelere git

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div/ul[1]/li[5]/a")).click();//Daha fazla

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div/ul[1]/li[4]/a")).click();// Arşivelnmiş öğelere git

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div/div/div[3]/div/div/div/div[1]/div/div/p/a[2]")).click();//kartı sil

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"chrome-container\"]/div[4]/div/div[2]/div/div/div/input")).click();//popup delete

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div/div/div[3]/div/div/div/div/div/div/p/a[2]")).click();//2.kartı sil

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"chrome-container\"]/div[4]/div/div[2]/div/div/div/input")).click();//pop delete again for second

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[1]/div/a[1]")).click();

        Thread.sleep(1500);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div/ul[3]/li/a")).click();//find from menu for close board

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"chrome-container\"]/div[4]/div/div[2]/div/div/div/input")).click();//close button

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/div[2]/button")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/div[2]/button")).click();//Pop up for delete

        Thread.sleep(2000);

        driver.quit();


















    }
}
