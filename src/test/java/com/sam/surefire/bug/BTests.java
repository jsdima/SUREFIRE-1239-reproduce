package com.sam.surefire.bug;

import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class BTests {
    @Test
    public void failedTest() {
        for (int i = 0; i < 10000; i++) {
            log.severe("Test log message BTests.failedTest:" + i);
        }
        assertTrue(false);
    }

}
