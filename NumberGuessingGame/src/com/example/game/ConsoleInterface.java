// ConsoleInterface.java

package com.example.game;

import java.util.Scanner;

public class ConsoleInterface implements GameInterface {
	private Scanner input = new Scanner(System.in);
	private Game game;

	public ConsoleInterface(Game game) {
		this.game = game;
	}

	public void start() {
		System.out.println("Guess the number between 1 and 100:");
		int guess = input.nextInt();

		while (!game.guess(guess)) {
			if (guess < game.getNumberToGuess()) {
				System.out.println("Too low, try again:");
			} else {
				System.out.println("Too high, try again:");
			}
			guess = input.nextInt();
		}

		System.out.println("You guessed the number!");
	}
}
