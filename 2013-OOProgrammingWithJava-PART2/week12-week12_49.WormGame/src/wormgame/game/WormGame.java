package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        generateApple();

        addActionListener(this);
        setInitialDelay(2000);

    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public boolean runsIntoWall() {
        for (Piece wormPiece : worm.getPieces()) {
            if (wormPiece.getX() < 0 || wormPiece.getX() >= width
                    || wormPiece.getY() < 0 || wormPiece.getY() >= height) {
                return true;
            }
        }
        return false;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void generateApple() {
        while (true) {
            Random random = new Random();
            apple = new Apple(random.nextInt(width), random.nextInt(height));
            if (!worm.runsInto(apple)) {
                break;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (continues == false) {
            return;
        } else {
            worm.move();
            if (worm.runsInto(apple)) {
                worm.grow();
                generateApple();
            } else if (worm.runsIntoItself() || runsIntoWall()) {
                continues = false;
            }
            updatable.update();
            setDelay(1000 / worm.getLength());
        }
    }
}
