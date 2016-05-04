package sokoban;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class ImageUtil {

    public static Image get(String name) {
        URL loc = ImageUtil.class.getResource("/sokoban/" + name);
        ImageIcon iia = new ImageIcon(loc);
        return iia.getImage();
    }
}
