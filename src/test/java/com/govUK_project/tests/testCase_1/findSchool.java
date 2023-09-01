package com.govUK_project.tests.testCase_1;

import com.govUK_project.tests.TestBase;
import com.govUK_project.utilities.*;
import org.testng.annotations.Test;

public class findSchool extends TestBase {

    /*
    test case 1

    open "https://www.gov.uk/"
    select 2education and learn"
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


    @Test
    public void testName() {
//        open "https://www.gov.uk/"
        driver.get(ConfigurationReader.get("url"));
    }
}
