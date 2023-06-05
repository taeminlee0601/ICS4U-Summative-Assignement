import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class FileFunctions {

    /**
     * Returns a resized Image variable
     * @param width
     * @param height
     * @return
     */
    public static Image resizeImage(File imageFile, int width, int height) {
        BufferedImage bufferedImage;
        Image resizedImage;

        try {
            bufferedImage = ImageIO.read(imageFile);
            resizedImage = bufferedImage.getScaledInstance(width, height, Image.SCALE_DEFAULT);

            return resizedImage;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
