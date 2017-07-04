package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {

        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {
                double probability = new Random().nextDouble();
                if (probability <= probabilityForEachCell) {
                    turnToLiving(x, y);
                } else {
                    turnToDead(x, y);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (!onBoard(x, y)) {
            return false;
        }
        return getBoard()[x][y];

    }

    @Override
    public void turnToLiving(int x, int y) {
        if (!onBoard(x, y)) {
            return;
        }
        getBoard()[x][y] = true;
    }

    @Override
    public void turnToDead(int x, int y) {
        if (!onBoard(x, y)) {
            return;
        }
        getBoard()[x][y] = false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int livingNeighbours = 0;

        int[] xcoords = {x-1,x,x+1,x-1,x+1,x-1,x,x+1};
        int[] ycoords = {y-1,y-1,y-1,y,y,y+1,y+1,y+1};

        for (int i = 0; i < 8; i++) {
                int first = xcoords[i];
                int second = ycoords[i];
                if (isAlive(first, second)) {
                    livingNeighbours++;
            }
        }
        return livingNeighbours;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (livingNeighbours > 3 || livingNeighbours < 2) {
            turnToDead(x, y);
        }
        if (!isAlive(x, y) && livingNeighbours == 3) {
            turnToLiving(x, y);
        }
    }

    public boolean onBoard(int x, int y) {
        if ((x < 0 || x > getWidth()-1) || (y < 0 || y > getHeight()-1)) {
            return false;
        }
        return true;
    }
}
