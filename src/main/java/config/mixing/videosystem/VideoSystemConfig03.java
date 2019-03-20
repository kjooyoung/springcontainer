package config.mixing.videosystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.douzone.springcontainer.videosystem.DVDPlayer;
import com.douzone.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
//xml import
@ImportResource("classpath:config/mixing/videosystem/DVDConfig.xml")
public class VideoSystemConfig03 {
	
	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengersInfinityWar") DigitalVideoDisc dvd) {
		//xml에 파라미터로 들어올 수 있는 dvd 인터페이스로 정의된 bean이 2개 이상이라 @Qualifier로 명시해주어야함
		return new DVDPlayer(dvd);
	}
}
