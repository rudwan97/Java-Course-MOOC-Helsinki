package game;

import gameoflife.Simulator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(5, 5);
        board.initiateRandomCells(0.7);

        Simulator simulator = new Simulator(board);
        simulator.simulate();

    }
}
