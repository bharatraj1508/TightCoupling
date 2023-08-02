package com.in28minutes.learnspringframework.game;

public class MarioGame {
	
	public String gameName() {
		return "Mario Game";
	}
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go into hole");
	}
	
	public void left() {
		System.out.println("Go Back");
		
	}
	
	public void right() {
		System.out.println("Accelerate");
	}

}
