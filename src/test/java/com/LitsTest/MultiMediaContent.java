package com.LitsTest;

import com.Lits.IMDB.ActorDetailPage;
import com.Lits.IMDB.MovieDetailsPage;
import com.Lits.IMDB.SignInPage;
import com.Lits.webdriver.WebDriverContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MultiMediaContent {



    @Test
    public void testIMDB() {
         ActorDetailPage actorDetailPage = new ActorDetailPage();
         MovieDetailsPage movieDetailsPage = new MovieDetailsPage();
         SignInPage signInPage = new SignInPage();

        WebDriverContext.loadURL("https://www.imdb.com/registration/signin");

        signInPage.setSignInWithIMDB();
        // sign in step
        signInPage.signInWithEmailANDPassword("tomasjefferson334@gmail.com", "Amway123");


        WebDriverContext.loadURL("https://www.imdb.com/title/tt0068646/");

        System.out.println(movieDetailsPage.getMovieTitle());

        Assert.assertTrue(movieDetailsPage.getMovieTitle().contains("The Godfather"));
        Assert.assertTrue(movieDetailsPage.getMovieTitle().contains("1972"));


        Assert.assertTrue(movieDetailsPage.castListSize() > 0, "Cast section is't ");

        movieDetailsPage.clickOnActorIcon(0);

        Assert.assertTrue(actorDetailPage.getActorDetailTitle().contains("Marlon Brando"));
        Assert.assertTrue(actorDetailPage.getActorDetailTitle().contains("1924–2004"));

        System.out.println(actorDetailPage.getActorDetailTitle());

    }


    @AfterMethod
    public void tearDown() {
        WebDriverContext.stop();
    }


}
