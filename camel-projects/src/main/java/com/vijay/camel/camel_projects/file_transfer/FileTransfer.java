package com.vijay.camel.camel_projects.file_transfer;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileTransfer {

	public static void main(String[] args) {

		CamelContext context = new DefaultCamelContext();

		try {
			context.addRoutes(new RouteBuilder() {

				@Override
				public void configure() throws Exception {
					from("file:doc/input?noop=true").to("file:doc/output");

				}
			});

			context.start();
			Thread.sleep(5000);
			context.stop();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
