package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getLoggerInstance().log("0001");
        //When
        String testLog = Logger.getLoggerInstance().getLastLog();
        //Then
        Assert.assertEquals("0001", testLog);
    }
}
