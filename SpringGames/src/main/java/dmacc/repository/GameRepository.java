package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
	
}