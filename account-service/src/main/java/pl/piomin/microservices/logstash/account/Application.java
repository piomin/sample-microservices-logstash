package pl.piomin.microservices.logstash.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	final static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("Starting application");
		SpringApplication.run(Application.class, args);
		logger.info("Application started");
		logger.info("Hello world!");
	}

}
