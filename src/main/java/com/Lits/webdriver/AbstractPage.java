package com.Lits.webdriver;

import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

    public AbstractPage(){
        PageFactory.initElements(WebDriverContext.getDriver(), this);
    }
}
