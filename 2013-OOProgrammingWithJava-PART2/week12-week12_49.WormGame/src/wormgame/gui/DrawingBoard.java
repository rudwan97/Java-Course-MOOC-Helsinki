package wormgame.gui;

import wormgame.domain.Piece;
import wormgame.game.WormGame;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel implements Updatable {
    private WormGame wormGame;
    private int pieceLength;

    public DrawingBoard(WormGame wormGame, int pieceLength) {
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        for (Piece piece : wormGame.getWorm().getPieces()) {
            graphics.setColor(Color.BLACK);
            graphics.fill3DRect(piece.getX() * pieceLength, piece.getY() * pieceLength,
                    pieceLength, pieceLength, true);
        }

        graphics.setColor(Color.RED);
        graphics.fillOval(wormGame.getApple().getX() * pieceLength, wormGame.getApple().getY() * pieceLength,
                pieceLength, pieceLength);


    }

    @Override
    public void update() {
        repaint();
    }
}
