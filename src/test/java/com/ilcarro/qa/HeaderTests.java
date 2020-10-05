package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{

    @BeforeMethod

    public void ensurePreconditions(){
        if(!isElementPresent(By.cssSelector("[href='/signup']"))){
            click(By.xpath("//a[contains(., 'logOut')]"));
        }
    }

    @Test

    public void testHeader(){
        //Search test
        click(By.cssSelector("header a[href='/search']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(., 'Find your car now!')]")));
        //wd.findElement(By.cssSelector("header [href='/']")).click();

        //Let the cat work test
        click(By.cssSelector("header a[href='/car']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(., 'Let the car work')]")));
        //wd.findElement(By.cssSelector("header [href='/']")).click();

        //Sign up test
        click(By.cssSelector("[href='/signup']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h2[contains(., 'Registration')]")));
        //wd.findElement(By.cssSelector("header [href='/']")).click();

        //Log in test
        click(By.cssSelector("[href='/login']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h2[contains(., 'Log in')]")));

        //Ilcarro logo test
        Assert.assertTrue(isElementPresent(By.cssSelector("header [href='/']")));
        click(By.cssSelector("header [href='/']"));
    }
}
