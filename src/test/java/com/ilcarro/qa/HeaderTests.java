package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{

    @BeforeMethod

    public void ensurePreconditions(){
        if(!isSignUpTabPresentInHeader()){
            logOut();
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
        openRegistrationFormFromHeader();
        Assert.assertTrue(isElementPresent(By.xpath("//h2[contains(., 'Registration')]")));
        //wd.findElement(By.cssSelector("header [href='/']")).click();

        //Log in test
        clickLoginTabOnHeader();
        Assert.assertTrue(isElementPresent(By.xpath("//h2[contains(., 'Log in')]")));

        //Ilcarro logo test
        Assert.assertTrue(isElementPresent(By.cssSelector("header [href='/']")));
        click(By.cssSelector("header [href='/']"));
    }

    @Test

    //fill in login form
    public void loginRegisteredUserPositiveTest () {
//pp@pp.com
        logIn();
        Assert.assertTrue(isUserLoggedIn());
        String email = getEmailTextFromHeader();
        System.out.println(email);
        Assert.assertEquals(email, "pp@pp.com");
    }

    @Test

    public void FillLetTheCatWorkForm(){
        Assert.assertTrue(isElementPresent(By.cssSelector(".let-carwork-style_lets_car_form__2fYnX")));

        type(By.cssSelector("[name='country']"), "Israel");
//        Is field filled correctly? Worth to make such checkings for all fields. I hadn't enought time to make it.
//        Assert.assertFalse(isElementPresent(By.xpath("//div[@class='let-carwork-style_let_car__location__30BIh']/" +
//                "*[contains(., 'Must be a Latin Character only')]")));
        type(By.cssSelector("[name='address']"), "Ramat Gan, Herzl, 13");
        type(By.cssSelector("[name='distance_included']"), "500");
        type(By.cssSelector("[name='serial_number']"), "111 11 111");
        type(By.cssSelector("[name='make']"), "Mazda");
        type(By.cssSelector("[name='model']"), "6 SW");
        type(By.cssSelector("[name='year']"), "2018");
        type(By.cssSelector("[name='engine']"), "M6");
        type(By.cssSelector("[name='fuel_consumption']"), "8");
        type(By.cssSelector("[name='fuel']"), "gasoline");
        type(By.cssSelector("[name='gear']"), "auto");
        type(By.cssSelector("[name='wheels_drive']"), "FWD");
        type(By.cssSelector("[name='horsepower']"), "150");
        type(By.cssSelector("[name='torque']"), "200");
        type(By.cssSelector("[name='doors']"), "5");
        type(By.cssSelector("[name='seats']"), "5");
        type(By.cssSelector("[name='car_class']"), "B");
        type(By.cssSelector("[name='about']"), "wonderful car");
        type(By.cssSelector("[name='features']"), "qwe, asd");
        type(By.cssSelector("[name='price_per_day']"), "100");

        submitForm();


    }
}
