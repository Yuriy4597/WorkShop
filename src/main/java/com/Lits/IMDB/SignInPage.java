package com.Lits.IMDB;

import com.Lits.webdriver.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(@class, 'imdb-logo')]/..")
    private WebElement signInWithIMDB;
    @FindBy(name = "email")
    private WebElement eamilInput;
    @FindBy(name = "password")
    private WebElement passwordInput;

    public void setSignInWithIMDB() {
        signInWithIMDB.click();
    }

    public void signInWithEmailANDPassword(String email, String password) {
        eamilInput.sendKeys(email);
        passwordInput.sendKeys(password);

        passwordInput.submit();
    }


}
