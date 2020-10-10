package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        // go to lodin page
    if(!isLoginFormPresent()){
        click(By.cssSelector("[href='/login']"));
    }

    }

    @Test
//dmzo@dmzo.com
    //fill in login form
    public void loginRegisteredUserPositiveTest () {

        fillLoginForm(new User().withEmail("pp@pp.com").withPassword("Peterpen1"));

        //submit login
        submitForm();
        Assert.assertTrue(isUserLoggedIn());
        String email = wd.findElement(By.cssSelector("[href='/account']")).getText();
        System.out.println(email);
        Assert.assertEquals(email, "pp@pp.com");
    }

    public void fillLoginForm(User user) {
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }
}
