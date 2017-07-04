package movingfigure;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel {
    private Figure figure;

    public DrawingBoard(Figure figure) {
        super.setBackground(Color.WHITE);
        this.figure = figure;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        figure.draw(graphics);

    }
}
