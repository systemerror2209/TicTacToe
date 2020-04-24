import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actionhandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (Gui.winner == 0) {

			for (int i = 0; i <= 8; i++) {
				if (e.getSource() == Gui.btn[i]) {
					if (Gui.state[i] == 0 && Gui.player == 0) {
						Gui.state[i] = 1;
						Gui.player = 1;
					} else if (Gui.state[i] == 0 && Gui.player == 1) {
						Gui.state[i] = 2;
						Gui.player = 0;
					}
				}
			}

		}

	}
}
