package com.ilcarro.qa;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class CreateAccountTest extends TestBase{
    //preconditions: user should be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if(!isElementPresent(By.cssSelector("[href='/signup']"))){    //sign up not present
            click(By.xpath("//a[contains(., 'logOut')]"));
        }
    }

        @Test
       public void testSignUp(){
            //click on sign up
       click(By.cssSelector("[href='/signup']"));
        assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

            //fill registration form
            type(By.cssSelector("#first_name"), "Dm");
            type(By.cssSelector("#second_name"), "Zo");
            type(By.cssSelector("#email"), "dmzo@dmzo.com");
            type(By.cssSelector("#password"), "1234567Aa");

            click(By.cssSelector("#check_policy"));

            submitForm();

            //check: login form displayed
        Assert.assertTrue(isLoginFormPresent());

        }
}







