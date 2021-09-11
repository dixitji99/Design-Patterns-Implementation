package templatepattern;

//This is an abstract class.  
abstract class Game {

	abstract void initialize();

	abstract void start();

	abstract void end();

	public final void play() {

		// initialize the game
		initialize();

		// start game
		start();

		// end game
		end();
	}
}// End of the Game abstract class.

//This is a class.  

class Chess extends Game {
	@Override
	void initialize() {
		System.out.println("Chess Game Initialized! Start playing.");
	}

	@Override
	void start() {
		System.out.println("Game Started. Welcome to in the chess game!");
	}

	@Override
	void end() {
		System.out.println("Game Finished!");
	}
}// End of the Chess class.

class Soccer extends Game {

	@Override
	void initialize() {
		System.out.println("Soccer Game Initialized! Start playing.");
	}

	@Override
	void start() {
		System.out.println("Game Started. Welcome to in the Soccer game!");
	}

	@Override
	void end() {
		System.out.println("Game Finished!");
	}
}// End of the Soccer class.

class TemplatePatternDemo {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Class c = Class.forName("templatepattern.Chess");
		@SuppressWarnings("deprecation")
		Game game = (Game) c.newInstance();
		game.play();
	}
}// End of the Soccer class.
