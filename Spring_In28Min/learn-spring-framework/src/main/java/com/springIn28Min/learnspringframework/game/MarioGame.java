package com.springIn28Min.learnspringframework.game;

public class MarioGame implements GamingConsole {

	// game Actions are here
	
	public void up() {
		System.out.println("JUMP");
	}
	
	public void down() {
		System.out.println("Go Down");
	}
	
	public void left() {
		System.out.println("Go Left");
	}
	
	public void right() {
		System.out.println("go right");
	}
}
