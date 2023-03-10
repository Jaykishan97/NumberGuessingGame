// Main.java

package com.example.main;

import com.example.game.ConsoleInterface;
import com.example.game.Game;
import com.example.game.GameInterface;

public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		GameInterface gameInterface = new ConsoleInterface(game);
		gameInterface.start();
	}
}
