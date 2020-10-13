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
        if(!isSignUpTabPresentInHeader()){    //sign up not present
            logOut();
        }
    }

    @Test
       public void testSignUp() throws InterruptedException {
            //click on sign up
       openRegistrationFormFromHeader();
        Assert.assertTrue(isRegistrationFormOpened());

            //fill registration form
            fillRegistrationForm(
                    new User().withFirstName("Pen")
                            .withSecondName("Peter")
                            .withEmail("pp@pp.com")
                            .withPassword("Peterpen1"));

            selectPolicyCheckBox();
            pause(2000);
            submitForm();

            //check: login form displayed
        Assert.assertTrue(isLoginFormPresent());
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

//    @Test
//    public void negativeTestSignUpWithoutPassword() throws InterruptedException {
//        //click On SignUp button
//        openRegistrationFormFromHeader();
//        Assert.assertTrue(isRegistrationFormOpened());
//
//        fillRegistrationForm(new User()
//                .withFirstName("Vasya")
//                .withSecondName("Katz")
//                .withEmail("vasya.katz1@gmail.com"));
//
//        selectPolicyCheckBox();
//        pause(3000);
//        //click submit button
//        submitForm();
//        //check, login form displayed
//        Assert.assertFalse(isLoginFormPresent());
//    }

}







