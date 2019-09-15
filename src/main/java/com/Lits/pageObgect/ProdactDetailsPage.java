package com.Lits.pageObgect;

import com.Lits.webdriver.WebDriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProdactDetailsPage {


    @FindBy(id= "isCartBtn_btn")
    private WebElement AddToCartBotton;
    @FindBy (name = "Colour")
    private WebElement colorSelect;

    public ProdactDetailsPage() {
        PageFactory.initElements(WebDriverContext.getDriver(), this);
    }

    public void ProdactDetailsCart() {
        AddToCartBotton.click();
    }

    public void selectDefaulColor() {
        new Select(colorSelect).selectByValue("0");
    }

}
