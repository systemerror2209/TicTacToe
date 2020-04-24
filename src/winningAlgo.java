import java.util.Timer;
import java.util.TimerTask;

public class winningAlgo {
	Timer time;

	public winningAlgo() {
		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Gui.winner == 0) {
					// Alle Möglichkeiten für beide Gewinner abfragen
					for (int i = 1; i <= 2; i++) {
						// Alle in der 1. Reihe
						if (Gui.state[0] == i && Gui.state[1] == i && Gui.state[2] == i) {
							Gui.winner = i;
							Gui.winline = 1;
							// Alle in der 2. Reihe
						} else if (Gui.state[3] == i && Gui.state[4] == i && Gui.state[5] == i) {
							Gui.winner = i;
							Gui.winline = 2;
							// Alle in der 3. Reihe
						} else if (Gui.state[6] == i && Gui.state[7] == i && Gui.state[8] == i) {
							Gui.winner = i;
							Gui.winline = 3;
							// Alle in der 1. Spalte
						} else if (Gui.state[0] == i && Gui.state[3] == i && Gui.state[6] == i) {
							Gui.winner = i;
							Gui.winline = 4;
							// Alle in der 2. Spalte
						} else if (Gui.state[1] == i && Gui.state[4] == i && Gui.state[7] == i) {
							Gui.winner = i;
							Gui.winline = 5;
							// Alle inder 3. Spalte
						} else if (Gui.state[2] == i && Gui.state[5] == i && Gui.state[8] == i) {
							Gui.winner = i;
							Gui.winline = 6;
							// Diagonal links oben bis recht unten
						} else if (Gui.state[0] == i && Gui.state[4] == i && Gui.state[8] == i) {
							Gui.winner = i;
							Gui.winline = 7;
							// Diagonal rechts oben bis links unten
						} else if (Gui.state[2] == i && Gui.state[4] == i && Gui.state[6] == i) {
							Gui.winner = i;
							Gui.winline = 8;
						}

					}
				}

			}
		}, 0, 150);
	}

}
