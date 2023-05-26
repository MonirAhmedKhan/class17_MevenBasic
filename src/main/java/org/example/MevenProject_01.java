package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MevenProject_01 {
    public static void main(String[] args) throws InterruptedException {
        //enhanced method
        // add WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        // go to website
        driver.get("file:///C:/Users/Monir%20Ahmed/Downloads/Class%2017%20-%20Selenium%20Basics%20and%20Locators/index.html");//    By.id()
//    By.name()
//    By.tagName()
//    By.className()
//    By.linkText()
//    By.partialLinkText()

//    By.xpath()
//    By.cssSelector()

        Thread.sleep(200);
        driver.findElement(By.id("fname")).sendKeys("Monir Ahmed Khan");
        Thread.sleep(400);
        driver.findElement(By.id("lname")).sendKeys("Khan");
        Thread.sleep(400);
        driver.findElement(By.id("pnumber")).sendKeys("01713563636");
        Thread.sleep(400);
        driver.findElement(By.name("email")).sendKeys("monir@gmail.com");
        Thread.sleep(400);
        driver.findElement(By.className("adress")).sendKeys("Kishoregnj,Dhaka,Bangladesh");
        Thread.sleep(400);
        driver.findElement(By.name("horns")).click();
        Thread.sleep(400);
        driver.findElement(By.id("contactChoice1")).click();
        Thread.sleep(400);
        driver.findElement(By.name("select")).click();
        Thread.sleep(400);
        driver.findElement(By.xpath("//option[@value='valor3']")).click();
        Thread.sleep(400);
        driver.findElement(By.name("select")).click();
        Thread.sleep(400);
        driver.findElement(By.linkText("Click here to visit Bangladesh")).click();
        Thread.sleep(400);
        driver.navigate().back();
        Thread.sleep(400);
        driver.findElement(By.partialLinkText("USA")).click();
        Thread.sleep(400);
        driver.navigate().back();
        driver.findElement(By.className("submit-btn")).click();
        Thread.sleep(400);

        WebElement element = driver.findElement(By.id("success"));
        String varyfayweb = element.getText();
        if (varyfayweb.contentEquals("Successfully Submited"))
            System.out.println("Successfully Submited - Pass");
        else System.out.println("Successfully Submited - Fale");

        Thread.sleep(1000);
        driver.quit();
        // driver.close();


//        WebElement searchBoxElement = driver.findElement(By.name("field-keywords"));
//        searchBoxElement.sendKeys("camera");
//        Thread.sleep(200);

//        WebElement searchbuttonElement = driver.findElement(By.id("nav-search-submit-button"));
//        searchbuttonElement.click();
//        Thread.sleep(200);

        System.out.println("I am Monir Khan");

    }
}
