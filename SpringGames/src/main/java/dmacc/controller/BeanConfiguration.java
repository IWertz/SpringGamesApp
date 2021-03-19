package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Game;

@Configuration
public class BeanConfiguration {
	@Bean
	public Game game() {
		Game bean = new Game();
		bean.setName("Portal 2");
		bean.setRating(4);
		bean.setReview("This game is super interesting.");
		return bean;
	}
}