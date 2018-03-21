package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User tom = new Millenials("Tom");
        User john = new YGeneration("John");
        User brigitte = new ZGeneration("Brigitte");
        //When
        String tomPublisher = tom.publisher();
        System.out.println(tom + tomPublisher);
        String johnPublisher = john.publisher();
        System.out.println(john + johnPublisher);
        String brigittePublisher = brigitte.publisher();
        System.out.println(brigitte + brigittePublisher);
        //Then
        Assert.assertEquals("favorite form of communication: Facebook", tomPublisher);
        Assert.assertEquals("favorite form of communication: Twitter", johnPublisher);
        Assert.assertEquals("favorite form of communication: Snapchat", brigittePublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User tom = new Millenials("Tom");
        User john = new YGeneration("John");
        User brigitte = new ZGeneration("Brigitte");
        //When
        tom.setSocialPublisher(new TwitterPublisher());
        String tomPublisher = tom.publisher();
        System.out.println("From now " + tom + tomPublisher);
        john.setSocialPublisher(new SnapchatPublisher());
        String johnPublisher = john.publisher();
        System.out.println("From now " + john + johnPublisher);
        brigitte.setSocialPublisher(new FacebookPublisher());
        String brigittePublisher = brigitte.publisher();
        System.out.println("From now " + brigitte + brigittePublisher);
        //Then
        Assert.assertEquals("favorite form of communication: Twitter", tomPublisher);
        Assert.assertEquals("favorite form of communication: Snapchat", johnPublisher);
        Assert.assertEquals("favorite form of communication: Facebook", brigittePublisher);
    }
}
