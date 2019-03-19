package com.douzone.springcontainer.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Component 
@Named("BlueBlood") // Component 어노테이션이랑 가능기능 (inject 라이브러리 추가해야 사용가능)
public class BlueBlood implements CompactDisc{

	private String title = "Endless Rain";
	private String artist = "X Japan";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	@Override
	public String toString() {
		return "BlueBlood [title=" + title + ", artist=" + artist + "]";
	}

}
