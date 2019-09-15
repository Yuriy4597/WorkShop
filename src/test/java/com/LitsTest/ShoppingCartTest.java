package com.LitsTest;

import com.Lits.pageObgect.EbayPage;
import com.Lits.pageObgect.ProdactDetailsPage;
import com.Lits.pageObgect.SearchResultPage;
import com.Lits.pageObgect.ShoppingCartPage;
import com.Lits.webdriver.WebDriverContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest {


    //private ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void testAddToShoppingCart() {
        EbayPage ebayPage = new EbayPage();

        SearchResultPage searchResultPage = new SearchResultPage();

        ProdactDetailsPage prodactDetailsPage = new ProdactDetailsPage();

        WebDriverContext.loadURL("https://www.ebay.com/");
        ebayPage.searchFor("iphone X");
        searchResultPage.clickFirstSearchresult();

        prodactDetailsPage.selectDefaulColor();
        String productDetailUrl = WebDriverContext.getDriver().getCurrentUrl();

        prodactDetailsPage.ProdactDetailsCart();


        Assert.assertEquals(WebDriverContext.getDriver().getCurrentUrl(), "https://cart.payments.ebay.com/", "Browser");


    }


    @AfterMethod
    public void tearDown() {
        WebDriverContext.stop();
    }

}
