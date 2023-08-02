package com.in28minutes.learnspringframework.game;

public class GameRunner {
	
	//MarioGame game;
	SuperContraGame game;
	
	public GameRunner(SuperContraGame game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Runnig Game: " + game.gameName());
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
