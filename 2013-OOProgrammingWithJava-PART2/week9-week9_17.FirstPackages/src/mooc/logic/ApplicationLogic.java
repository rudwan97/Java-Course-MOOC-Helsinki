package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {
        int i = 0;
        while (i < howManyTimes) {
            System.out.println("The application logic works");
            ui.update();
            i++;
        }
    }
}
