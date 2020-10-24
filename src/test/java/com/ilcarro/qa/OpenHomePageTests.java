package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenHomePageTests extends TestBase {

    @Test
    public void HomePageTest(){
        System.out.println("site opened");

       // wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
        System.out.println(isFindCarFormPresent());

       // isFindCarFormPresent2();
    }
}
