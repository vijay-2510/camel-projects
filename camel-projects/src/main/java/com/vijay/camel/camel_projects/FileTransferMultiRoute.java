package com.vijay.camel.camel_projects;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileTransferMultiRoute {

	public static void main(String[] args) {

		CamelContext context = new DefaultCamelContext();

		try {
			context.addRoutes(new RouteBuilder() {

				@Override
				public void configure() throws Exception {
					from("file:doc/input?noop=true")
						.to("log:File-Tranfer-Using-Log?level=INFO&showBody=true")
						.to("file:doc/output");
					
					from("file:doc/input1?noop=true")
					.to("log:File-Tranfer-Using-Log?level=INFO&showBody=true")
					.to("file:doc/output1");
					
					

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
