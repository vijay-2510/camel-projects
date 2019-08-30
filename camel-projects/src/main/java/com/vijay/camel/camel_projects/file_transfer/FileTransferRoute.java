package com.vijay.camel.camel_projects.file_transfer;

import org.apache.camel.builder.RouteBuilder;

public class FileTransferRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:doc/input?noop=true")
			.to("log:File-Tranfer-Using-Log?level=INFO&showBody=true")
			.to("file:doc/output");
	}

}
