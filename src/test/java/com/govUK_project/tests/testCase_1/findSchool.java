package com.govUK_project.tests.testCase_1;

import com.govUK_project.pages.DashboardPage;
import com.govUK_project.tests.TestBase;
import com.govUK_project.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class findSchool extends TestBase {

    /*
    test case 1

    open "https://www.gov.uk/"
    select education and learn"
    select "schools and curriculum"
    select "Find an Ofsted inspection report"
    click "start now" button
    input "grammer school" in "Name, URN or keyword" text box
    input "london uxbridge" in "Location or postcode" text box
    click "Education and training" radio button
    after drop down
    select "secondary" and  "Further education and skills" check box at the same time
    click "search " button
    select "Bishopshalt School"

     */


//    open "https://www.gov.uk/"

    DashboardPage dashboardPage = new DashboardPage();
    @Test
    public void testName() throws InterruptedException {
//        open "https://www.gov.uk/"
        driver.get(ConfigurationReader.get("url"));
        //select education and learn"

//       // (//button[@class='gem-c-button govuk-button'])[2]
        dashboardPage.rejectCookie.click();

        //ul[starts-with(@class,'gem-c-layout-super-navigation-header__n')]/li
//        driver.findElements(By.xpath("//ul[starts-with(@class,'gem-c-layout-super-navigation-header__n')]/li"))


        dashboardPage.goToService("Benefits");
        Thread.sleep(3000);

    }
}
