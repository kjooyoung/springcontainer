package config.mixing.videosystem;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.springcontainer.videosystem.Avengers;
import com.douzone.springcontainer.videosystem.BlankDisc;

@Configuration
public class DVDConfig {
	
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	@Bean(name="avengersInfinityWar")
	public BlankDisc blankDisc() {
		BlankDisc blankDisk = new BlankDisc();
		blankDisk.setTitle("Avengers Infinity War");
		blankDisk.setStudio("MARVEL");
		blankDisk.setActors( 
				Arrays.asList("Robert Downey Jr.","Chris Hemsworth",
							  "Benedict Cumberbatch","Josh Brolin"));
		return blankDisk;
	}
}
