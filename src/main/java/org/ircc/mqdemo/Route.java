package org.ircc.mqdemo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.Processor;
import java.util.UUID;

import org.apache.camel.Exchange;


@Component
public class Route extends RouteBuilder{

	@Override
	public void configure() throws Exception {

                from("direct:log-service")  
                .setHeader("TRANSACTION_ID").simple(UUID.randomUUID().toString())
                .setBody(simple("body")) 
                .log("log")    
                .to("jms:SampleQueue?exchangePattern=InOnly");   

	}
}

