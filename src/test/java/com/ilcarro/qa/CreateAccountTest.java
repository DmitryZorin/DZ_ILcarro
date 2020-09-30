package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{
    //preconditions: user should be logged out
    @BeforeMethod
    public void insurePreconditions(){
        if(isElementPresent(By.cssSelector("[href='/signup']"))){  //sign up not present
        wd.findElement(By.xpath("a[contains(., 'logOut')]")).click();


        }

        @Test
       public void testSignUp(){
            //click on sign up
        wd.findElement(By.cssSelector("\"[href='/signup']\"")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

            //fill registration form
        wd.findElement(By.cssSelector("#first_name")).click();
        wd.findElement(By.cssSelector("#first_name")).clear();
        wd.findElement(By.cssSelector("#first_name")).sendKeys("Dm");

        wd.findElement(By.cssSelector("#second_name")).click();
        wd.findElement(By.cssSelector("#second_name")).clear();
        wd.findElement(By.cssSelector("#second_name")).sendKeys("Zo");

        wd.findElement(By.cssSelector("#email")).click();
        wd.findElement(By.cssSelector("#email")).clear();
        wd.findElement(By.cssSelector("#email")).sendKeys("dmzo@dmzo.com");

        wd.findElement(By.cssSelector("#password")).click();
        wd.findElement(By.cssSelector("#password")).clear();
        wd.findElement(By.cssSelector("#password")).sendKeys("1234567Aa");

        wd.findElement(By.cssSelector("#check_policy")).click();


        }

            //click on logout button
    }

    //click submit button

    //check: login form displayed

}
