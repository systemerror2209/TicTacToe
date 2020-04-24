import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	static Image imgX, imgO;

	public ImageLoader() {
		try {
			imgX = ImageIO.read(new File("resources/x.png"));
			imgO = ImageIO.read(new File("resources/o.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
