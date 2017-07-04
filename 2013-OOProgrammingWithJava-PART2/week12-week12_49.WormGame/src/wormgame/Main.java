package wormgame;

import javax.swing.SwingUtilities;

import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.UserInterface;
import wormgame.game.WormGame;

public class Main {

    public static void main(String[] args) {
        WormGame game = new WormGame(20, 20);

        UserInterface userInterface = new UserInterface(game, 20);
        SwingUtilities.invokeLater(userInterface);

        while (userInterface.getUpdatable() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("The drawing board hasn't been created yet.");
            }
        }

        game.setUpdatable(userInterface.getUpdatable());
        game.start();
    }
}
