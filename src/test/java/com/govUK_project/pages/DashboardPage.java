package com.govUK_project.pages;


import com.govUK_project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button'][2]")
    public WebElement rejectCookie;

    @FindBy(xpath = "//ul[starts-with(@class,'gem-c-layout-super-navigation-header__n')]/li")
    public List<WebElement> serviceList;


    public void goToService(String serviceName) {
        for (WebElement webElement : serviceList) {
            if (webElement.getText().equals(serviceName)) {
                System.out.println(webElement.getText());
                webElement.click();
            }
        }


    }
}

