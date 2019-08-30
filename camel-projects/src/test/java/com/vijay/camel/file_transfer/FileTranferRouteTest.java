package com.vijay.camel.file_transfer;

import java.io.File;

import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class FileTranferRouteTest extends CamelTestSupport {

	@Test
	public void checkOutputDirectory() throws InterruptedException {
		Thread.sleep(5000);

		File file = new File("doc/output");
		assertTrue(file.isDirectory());
		assertEquals(2, file.list().length);

	}

}
