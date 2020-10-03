package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTests extends TestBase{
    @BeforeMethod

    public void ensurePreconditions(){
        if(!isElementPresent(By.cssSelector("[href='/signup']"))){
            wd.findElement(By.xpath("//a[contains(., 'logOut')]")).click();
        }
    }

    @Test

    public void testFooter(){

        //Search test
        wd.findElement(By.cssSelector("footer a[href='/search']")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(., 'Find your car now!')]")));
        wd.findElement(By.cssSelector("header [href='/']")).click();
    
        //Let the cat work test
        wd.findElement(By.cssSelector("footer a[href='/car']")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(., 'Let the car work')]")));
        //wd.findElement(By.cssSelector("header [href='/']")).click();

        //Ilcarro logo test
        Assert.assertTrue(isElementPresent(By.cssSelector("footer [href='/']")));
        wd.findElement(By.cssSelector("footer [href='/']")).click();
    }
}