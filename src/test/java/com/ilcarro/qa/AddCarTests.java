package com.ilcarro.qa;

import org.testng.annotations.Test;

public class AddCarTests extends TestBase{

    @Test
    public void testFormLetTheCarWorkForLoggedInUser() throws InterruptedException {
        if(!isUserLoggedIn()){
            logIn();
        }

        openAddCarFormFromHeader();
        fillCarForm(
                new Car().setCountry("Israel").setAddress("Herzl").setDistanceIncluded("1000")
                        .setSerialNumber("32165987").setBrand("Mazda").setModel("6").setYear("2018")
                        .setEngine("R4").setFuelConsumption("8").setTransmission("automatic")
                        .setWd("front").setHorsepower("150").setTorque("170").setDoors("4")
                        .setSeats("5").setClasss("B").setAbout("qwerasdf")
                        .setTypeFeature("zxcv").setPrice("100"));

        pause(2000);
        submitForm();

    }

    @Test
    public void testFormLetTheCarWorkForNotLoggedInUser() throws InterruptedException {
        if(isUserLoggedIn()){
            logOut();
        }
        openAddCarFormFromHeader();
        fillCarForm(
                new Car().setCountry("Israel").setAddress("Herzl").setDistanceIncluded("1000")
                        .setSerialNumber("32165987").setBrand("Mazda").setModel("6").setYear("2018")
                        .setEngine("R4").setFuelConsumption("8").setTransmission("automatic")
                        .setWd("front").setHorsepower("150").setTorque("170").setDoors("4")
                        .setSeats("5").setClasss("B").setAbout("qwerasdf")
                        .setTypeFeature("zxcv").setPrice("100"));

        pause(2000);
        submitForm();

    }

    @Test
    public void NegativeTestAddCarWithoutDorsInfo(){
        openAddCarFormFromHeader();
        fillCarForm(
                new Car().setCountry("Israel").setAddress("Herzl").setDistanceIncluded("1000")
                        .setSerialNumber("32165987").setBrand("Mazda").setModel("6").setYear("2018")
                        .setEngine("R4").setFuelConsumption("8").setTransmission("automatic")
                        .setWd("front").setHorsepower("150").setTorque("170")
                        .setSeats("5").setClasss("B").setAbout("qwerasdf")
                        .setTypeFeature("zxcv").setPrice("100"));

        submitForm();

    }


}

