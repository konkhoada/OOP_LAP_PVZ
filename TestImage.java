import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class TestImage {
    public static void main(String[] args) {
        String[] paths = {
            "images/plants/electropeashooter.gif",
            "images/cards/card_electropeashooter.png",
            "images/electropea.png",
            "images/plants/peashooter.gif"
        };
        for (String path : paths) {
            URL url = TestImage.class.getResource(path);
            System.out.println(path + " => URL: " + url);
            if (url != null) {
                ImageIcon icon = new ImageIcon(url);
                Image img = icon.getImage();
                System.out.println("  Image loaded: " + (img != null));
                System.out.println("  Width: " + img.getWidth(null));
                System.out.println("  Height: " + img.getHeight(null));
            }
        }
    }
}

