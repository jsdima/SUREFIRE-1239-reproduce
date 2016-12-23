package com.sam.surefire.bug;

import lombok.extern.java.Log;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class ATests {

	@Test
	public void someTest() {
		assertTrue(true);
	}

	@AfterClass
	static public void tearDown() throws Exception {
		for (int i = 0; i < 10000; i++) {
			log.severe("Long text output after test :"+i);
		}
	}
}
