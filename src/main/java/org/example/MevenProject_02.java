package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MevenProject_02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("file:///C:/Java/webpage/khali%20vi/New%20indedx.html");

        driver.findElement(By.id("fname")).sendKeys("Monir Ahmed");
        Thread.sleep(400);
        driver.findElement(By.id("lname")).sendKeys("Khan");
        Thread.sleep(400);
        driver.findElement(By.id("pnumber")).sendKeys("0171234");
        Thread.sleep(400);
        driver.findElement(By.name("email")).sendKeys("@gmai.com");
        driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("Kishoregonj,Dhaka,Bangladesh");

//        WebElement img = driver.findElement(By.xpath("//img[@src='download.jpg']"));
//        if(img.isDisplayed())
//            System.out.println("This is sun Flower");
//        else System.out.println("This is Not Sun Flower");

       String g =  driver.findElement(By.tagName("img")).getTagName();
        System.out.println("This Tag name is "+g);
        driver.findElement(By.linkText("for help click here")).click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("click here")).click();
        driver.navigate().back();
        driver.findElement(By.id("scales")).click();
        driver.findElement(By.id("horns")).click();
        driver.findElement(By.xpath("//input[@value='Yes']")).click();
        driver.findElement(By.name("select")).click();
        driver.findElement(By.xpath("//option[@value='valor3']")).click();
        driver.findElement(By.id("submited")).click();
        WebElement element= driver.findElement(By.id("success"));
        String varyfay = element .getText();
        if (varyfay.contentEquals("Submited"))
            System.out.println("Submited Pass");
        else System.out.println("Submited Fail");


                              


    }
}
