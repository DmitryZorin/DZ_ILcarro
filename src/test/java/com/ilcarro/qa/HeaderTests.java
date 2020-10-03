package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{

    @BeforeMethod

    public void ensurePreconditions(){
        if(!isElementPresent(By.cssSelector("[href='/signup']"))){
            wd.findElement(By.xpath("//a[contains(., 'logOut')]")).click();
        }
    }

    @Test

    public void testHeader(){
        //Search test
        wd.findElement(By.cssSelector("header a[href='/search']")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(., 'Find your car now!')]")));
        //wd.findElement(By.cssSelector("[href='/']")).click();

        //Let the cat work test
        wd.findElement(By.cssSelector("header a[href='/car']")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(., 'Let the car work')]")));
        //wd.findElement(By.cssSelector("[href='/']")).click();

        //Sign up test
        wd.findElement(By.cssSelector("[href='/signup']")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//h2[contains(., 'Registration')]")));
        //wd.findElement(By.cssSelector("[href='/']")).click();

        //Log in test
        wd.findElement(By.cssSelector("[href='/login']")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//h2[contains(., 'Log in')]")));

        //Ilcarro logo test
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/']")));
        wd.findElement(By.cssSelector("[href='/']")).click();
    }
}
