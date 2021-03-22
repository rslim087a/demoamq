package org.ircc.mqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.apache.camel.ProducerTemplate;

@SpringBootApplication
@ImportResource({"classpath:spring/configuration.xml"})
public class MqdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqdemoApplication.class, args);

	}

}
