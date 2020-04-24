import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {
	JFrame jf;
	Draw draw;
	JButton btnReset;

	static JButton btn[] = new JButton[9];
	static int state[] = new int[9];
	static int player = 0;
	static int winner = 0;
	static int winline = 0;
	static int secPlayerExt = 0;

	public static int sizex = 800, sizey = 600;

	public Gui() {

		jf = new JFrame();
		jf.setSize(sizex, sizey);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setTitle("Tic Tac Toe");

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].addActionListener(new Actionhandler());
			// Text der Buttons wird nicht umrandet
			btn[i].setFocusPainted(false);
			// Inhalt der Button wird nicht sichtbar
			btn[i].setContentAreaFilled(false);
			// Ränder werden nicht sichtbar
			btn[i].setBorder(null);
			// Button wird sichtbar
			btn[i].setVisible(true);
			// Button hinzufügen
			jf.add(btn[i]);
		}
		ButtonPlacement.place();

		btnReset = new JButton("Neues Spiel");
		btnReset.setBounds(650, 500, 120, 40);
		btnReset.setVisible(true);
		btnReset.setBackground(new Color(51, 102, 153));
		btnReset.setForeground(Color.WHITE);
		// Kein Viereck um den Text wenn mouseover
		btnReset.setFocusPainted(false);
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Reset.startNewGame();

			}
		});

		draw = new Draw();
		draw.setBounds(0, 0, sizex, sizey);
		draw.setVisible(true);

		jf.add(btnReset);
		jf.add(draw);
		jf.setVisible(true);
	}
}
