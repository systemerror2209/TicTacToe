import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(new Color(255, 230, 204));
		g.fillRect(0, 0, Gui.sizex, Gui.sizey);
		// Ab hier kann gezeichnet werden

		g.setColor(Color.BLACK);

		// Zeichne Vertikale Linien des Spielfeldes
		g.drawLine(325, 50, 325, 500);
		g.drawLine(475, 50, 475, 500);
		// Zeichne Horizontale Linien des Spielfeldes
		g.drawLine(175, 200, 625, 200);
		g.drawLine(175, 350, 625, 350);

		// Spieler anzeigen
		if (Gui.player == 0) {
			g.drawString("Spieler: X", 25, 50);
		} else if (Gui.player == 1) {
			g.drawString("Spieler: O", 25, 50);
		} else if (Gui.winner == 1 || Gui.winner == 2) {
			g.drawString("12", 25, 50);
		}

		// Gewinner anzeigen
		if (Gui.winner == 1) {
			g.drawString("Gewinner: X", 25, 75);
		} else if (Gui.winner == 2) {
			g.drawString("Gewinner: O", 25, 75);
		}
		
		// Zeichne den Gewinnstrich
		g.setColor(new Color(255, 0, 0));
		if (Gui.winline == 1) {
			g2d.setStroke(new BasicStroke(10));
			g.drawLine(175, 125, 625, 125);
		} else if (Gui.winline == 2) {
			g2d.setStroke(new BasicStroke(10));
			g.drawLine(175, 275, 625, 275);
		} else if (Gui.winline == 3) {
			g2d.setStroke(new BasicStroke(10));
			g.drawLine(175, 425, 625, 425);
		} else if (Gui.winline == 4) {
			g2d.setStroke(new BasicStroke(10));
			g.drawLine(250, 50, 250, 500);
		} else if (Gui.winline == 5) {
			g2d.setStroke(new BasicStroke(10));
			g.drawLine(400, 50, 400, 500);
		} else if (Gui.winline == 6) {
			g2d.setStroke(new BasicStroke(10));
			g.drawLine(550, 50, 550, 500);
		} else if (Gui.winline == 7) {
			g2d.setStroke(new BasicStroke(10));
			g.drawLine(175, 50, 625, 500);
		} else if (Gui.winline == 8) {
			g2d.setStroke(new BasicStroke(10));
			g.drawLine(175, 500, 625, 50);
		} 
		// Reihe 1
		if (Gui.state[0] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 50, 150, 150, null);
		} else if (Gui.state[0] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 50, 150, 150, null);
		}

		if (Gui.state[1] == 1) {
			g.drawImage(ImageLoader.imgX, 325, 50, 150, 150, null);
		} else if (Gui.state[1] == 2) {
			g.drawImage(ImageLoader.imgO, 325, 50, 150, 150, null);
		}

		if (Gui.state[2] == 1) {
			g.drawImage(ImageLoader.imgX, 475, 50, 150, 150, null);
		} else if (Gui.state[2] == 2) {
			g.drawImage(ImageLoader.imgO, 475, 50, 150, 150, null);
		}
		// Reihe 2
		if (Gui.state[3] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 200, 150, 150, null);
		} else if (Gui.state[3] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 200, 150, 150, null);
		}

		if (Gui.state[4] == 1) {
			g.drawImage(ImageLoader.imgX, 325, 200, 150, 150, null);
		} else if (Gui.state[4] == 2) {
			g.drawImage(ImageLoader.imgO, 325, 200, 150, 150, null);
		}

		if (Gui.state[5] == 1) {
			g.drawImage(ImageLoader.imgX, 475, 200, 150, 150, null);
		} else if (Gui.state[5] == 2) {
			g.drawImage(ImageLoader.imgO, 475, 200, 150, 150, null);
		}
		// Reihe 3
		if (Gui.state[6] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 350, 150, 150, null);
		} else if (Gui.state[6] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 350, 150, 150, null);
		}

		if (Gui.state[7] == 1) {
			g.drawImage(ImageLoader.imgX, 325, 350, 150, 150, null);
		} else if (Gui.state[7] == 2) {
			g.drawImage(ImageLoader.imgO, 325, 350, 150, 150, null);
		}

		if (Gui.state[8] == 1) {
			g.drawImage(ImageLoader.imgX, 475, 350, 150, 150, null);
		} else if (Gui.state[8] == 2) {
			g.drawImage(ImageLoader.imgO, 475, 350, 150, 150, null);
		}
		repaint();
	}
}
