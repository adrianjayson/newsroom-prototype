package com.adrianjayson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
////			Quote quote = restTemplate.getForObject(
////					"http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//
//			News news = restTemplate.getForObject("https://newsapi.org/v1/articles?source=bbc-news&sortBy=top&apiKey=4e17299fccae427b9b2e4783a736f54b"
//											, News.class);
//			log.info(news.toString());
//		};
//	}


}