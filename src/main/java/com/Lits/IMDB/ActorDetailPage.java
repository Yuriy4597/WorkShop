package com.Lits.IMDB;

import com.Lits.webdriver.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActorDetailPage extends AbstractPage {

    @FindBy(xpath = "//*[@class = 'name-overview-widget__section']/h1")
    private WebElement ActorDetail;

    public String getActorDetailTitle() {
        return ActorDetail.getText().trim();
    }


}
