package com.govUK_project.pages;

import com.govUK_project.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    Driver driver;

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);



    }

}
