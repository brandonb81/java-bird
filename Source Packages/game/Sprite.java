package game;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Sprite {

    public static BufferedImage getSprite(String filename) throws IOException {
        return ImageIO.read(Sprite.class.getResourceAsStream(filename));
    }

}
