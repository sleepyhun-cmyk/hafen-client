package haven;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class MinimapWidget extends Widget {
    private static final Coord SIZE = new Coord(200, 200);
    private BufferedImage img;

    public MinimapWidget(Coord c, UI ui) {
        super(c, SIZE, ui);
        img = new BufferedImage(SIZE.x, SIZE.y, BufferedImage.TYPE_INT_RGB);
    }

    @Override
    public void draw(GOut g) {
        Graphics2D g2 = img.createGraphics();
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, SIZE.x, SIZE.y);
        g2.setColor(Color.GREEN);
        g2.fillOval(SIZE.x/2 - 2, SIZE.y/2 - 2, 4, 4);
        g.image(img, Coord.z);
        super.draw(g);
    }
}