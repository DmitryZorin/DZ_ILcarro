package com.ilcarro.qa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions() {
        // go to login page
        if (!isLoginFormPresent()) {
            if (isUserLoggedIn()) {
                logOut();
            }
            clickLoginTabOnHeader();
        }
    }

    @Test

    //fill in login form
    public void loginRegisteredUserPositiveTest () {
//pp@pp.com
        fillLoginForm(new User().withEmail("pp@pp.com").withPassword("Peterpen1"));

        submitForm();

        Assert.assertTrue(isUserLoggedIn());
        String email = getEmailTextFromHeader();
        System.out.println(email);
        Assert.assertEquals(email, "pp@pp.com");
    }


}
