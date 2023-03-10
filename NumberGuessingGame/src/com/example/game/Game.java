// Game.java

package com.example.game;

import java.util.Random;

public class Game {
	private int numberToGuess;

	public Game() {
		Random random = new Random();
		numberToGuess = random.nextInt(100) + 1;
	}

	public boolean guess(int guess) {
		return guess == numberToGuess;
	}

	public int getNumberToGuess() {
		return numberToGuess;
	}
}
