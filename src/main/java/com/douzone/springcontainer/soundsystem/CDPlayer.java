package com.douzone.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	//와이어링1
//	@Autowired
	private CompactDisc cd;
	
	//와이어링2
//	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	//와이어링3
	public CDPlayer() {}
//	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	//와이어링4
	@Autowired
	public void k(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
}
