package dmacc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Game;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.GameRepository;

@SpringBootApplication
public class SpringGamesApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringGamesApplication.class, args);
	}
	
	@Autowired 
	GameRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Game g = new Game("Black Ops 1", 5, "This game rocks!");
		repo.save(g);
		
		List<Game> allMyGames = repo.findAll();
		for(Game games: allMyGames) {
			System.out.println(games.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
		
	
}
