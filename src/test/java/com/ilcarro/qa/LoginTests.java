package com.ilcarro.qa;

import org.openqa.selenium.By;
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

    public void loginRegisteredUserPositiveTest () {
        //dmzo@dmzo.com
        //fill in login form
       type(By.name("email"), "dmzo@dmzo.com");
       type(By.name("password"), "1234567Aa");

        //submit login
        submitForm();
    }
}
