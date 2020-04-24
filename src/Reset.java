
public class Reset {

	public static void startNewGame() {

		for (int i = 0; i < Gui.state.length; i++) {

			Gui.state[i] = 0;
			Gui.player = 0;
			Gui.winner = 0;
			Gui.winline = 0;

		}

	}
}
