package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTests extends TestBase{
    @BeforeMethod

    public void ensurePreconditions(){
        if(!isElementPresent(By.cssSelector("[href='/signup']"))){
            click(By.xpath("//a[contains(., 'logOut')]"));
        }
    }

    @Test

    public void testFooter(){

        //Search test
        click(By.cssSelector("footer a[href='/search']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(., 'Find your car now!')]")));
        click(By.cssSelector("header [href='/']"));

        //Let the cat work test
        click(By.cssSelector("footer a[href='/car']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h3[contains(., 'Let the car work')]")));
        //wd.findElement(By.cssSelector("header [href='/']")).click();

        //Ilcarro logo test
        Assert.assertTrue(isElementPresent(By.cssSelector("footer [href='/']")));
        click(By.cssSelector("footer [href='/']"));
    }
}
