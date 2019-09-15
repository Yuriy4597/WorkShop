package com.Lits.pageObgect;

import com.Lits.webdriver.WebDriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPage {

    @FindBy(xpath = "//*[@data-test-id='cart-item-link']")
    private List<WebElement> shoppingCartItemsTitles;

    ShoppingCartPage() {
        PageFactory.initElements(WebDriverContext.getDriver(), this);

    }

    public List<String> ShoppingCartItemsTitlesHrefAttrs() {

        List<String> hrefs = new ArrayList<>();
        for (WebElement we : shoppingCartItemsTitles) {
            String href = we.getAttribute("href");
            hrefs.add(href);
        }

        return hrefs;
    }
}
