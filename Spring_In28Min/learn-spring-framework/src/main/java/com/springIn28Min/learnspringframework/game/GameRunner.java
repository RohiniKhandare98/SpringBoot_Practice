package com.springIn28Min.learnspringframework.game;

public class GameRunner {

	GamingConsole game;
	public GameRunner(GamingConsole game) {   // constructor for mariogame
		
		this.game = game;
	}

	
	public void run() {
		System.out.println(" Game running" +game);
		
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
