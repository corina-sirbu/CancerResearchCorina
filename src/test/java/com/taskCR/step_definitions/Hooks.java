package com.taskCR.step_definitions;

import com.taskCR.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
    }

    @After
    public void tearDown(){


        Driver.closeDriver();

    }


}
