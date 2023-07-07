package com.springIn28Min.learnspringframework;

import com.springIn28Min.learnspringframework.game.GameRunner;
import com.springIn28Min.learnspringframework.game.MarioGame;
import com.springIn28Min.learnspringframework.game.PackManGame;
import com.springIn28Min.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PackManGame();
		
		var gameRunner = new GameRunner(game);
//		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
		

	}

}
