package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.douzone.springcontainer.soundsystem")
//@ComponentScan(basePackages= {"com.douzone.springcontainer.soundsystem","com.douzone.springcontainer.videosystem"})

// Error!!
// Index 클래스가 잇는 패키지 전체를 스캔함.
// Index 클래스가 soundsystem 패키지에는 없기 때문에 에러
//@ComponentScan(basePackageClasses=Index.class)
public class CDPlayerConfig {
	
}
