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
       public void testSignUp() throws InterruptedException {
            //click on sign up
       click(By.cssSelector("[href='/signup']"));
        assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

            //fill registration form
            fillRegistrationForm(
                    new User().withFirstName("Pen")
                            .withSecondName("Peter")
                            .withEmail("pp@pp.com")
                            .withPassword("Peterpen1"));

            click(By.cssSelector("#check_policy"));

            pause(2000);

            submitForm();

            //check: login form displayed
        Assert.assertTrue(isLoginFormPresent());

        }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void fillRegistrationForm(User user) {
        type(By.cssSelector("#first_name"), user.getFirstName());
        type(By.cssSelector("#second_name"), user.getSecondName());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());
    }
}







