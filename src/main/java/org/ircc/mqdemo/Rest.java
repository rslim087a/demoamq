package org.ircc.mqdemo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

@Component
public class Rest extends RouteBuilder{

	@Override
	public void configure() throws Exception {

        restConfiguration().component("undertow").scheme("http").port("8443").bindingMode(RestBindingMode.auto);
        
		rest("/api/")
		.get("logState").to("direct:log-service");
	//    .post("logState").type(StatePojo.class).to("direct:log-service");

	}
}
