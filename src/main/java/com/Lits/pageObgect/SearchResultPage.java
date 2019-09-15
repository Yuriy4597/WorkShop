package com.Lits.pageObgect;

import com.Lits.webdriver.WebDriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage {

    @FindBy(css = "#srp-river-results>ul>li>div>div>a")
    private List<WebElement> titles;



    public SearchResultPage(){
        PageFactory.initElements(WebDriverContext.getDriver(), this);
    }


    public void clickFirstSearchresult(){
        titles.get(0).click();

    }

}
