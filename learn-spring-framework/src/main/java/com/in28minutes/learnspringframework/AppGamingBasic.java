package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		var superContraGame = new SuperContraGame();
		
		//var marioGame = new MarioGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();

	}

}
