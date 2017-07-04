package dungeon;

import java.util.*;

public class Dungeon {
    private int length;
    private int height;
    private int vampires;
    private int movesAvailable; //moves
    private boolean vampiresMove;
    private Player player;
    private Vampires vampirePositions;
    private Map<Integer, String> mapLayout;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.movesAvailable = moves;
        this.vampiresMove = vampiresMove;
        this.mapLayout = new HashMap<>();
        this.player = new Player();
        this.vampirePositions = new Vampires();
    }

    public void run() {
        Scanner reader = new Scanner(System.in);
        startVampires();
        mapUpdate();
        for (int i = movesAvailable; i > 0; i--) {
            System.out.println(i);
            System.out.println();
            printDungeon();
            String moves = reader.nextLine();
            Move(moves);
            mapUpdate();
            if (vampirePositions.getVampireCoordinates().contains(player.getCoordinates()) &&
                    vampirePositions.getVampireCoordinates().size() == 1) {
                System.out.println("YOU WIN");
                break;

            }
        }
        if (!vampirePositions.getVampireCoordinates().isEmpty()) {
            System.out.println("YOU LOSE");
        }

        
    }

    public void startVampires() {
        vampirePositions.startPositionVampires(vampires, length, height);
    }

    public void mapUpdate() {
        for (int i = 0; i < height; i++) {
            String blank = "";
            for (int j = 0; j < length; j++) {
                if (player.getRow() == i && player.getColumn() == j) {
                    blank += "@";
                } else if (vampirePositions.vampireCoordinateExists(i, j)){
                    blank+= "v";
                } else {
                    blank += ".";
                }
            }
            mapLayout.put(i, blank);
        }
    }

    public void Move(String moves) {
        String movesPlayer = moves;

        for (int i = 0; i < movesPlayer.length(); i++) {
            movePlayer(movesPlayer.charAt(i));
            if (vampiresMove == true) {
                moveVampires();
            }
        }
        movesAvailable--;
    }

    public void movePlayer(char move) {
        int row = player.getRow();
        int column = player.getColumn();

            if (move == 'w') {
                if (row - 1 >= 0) {
                    player.setCoordinates(row - 1, column);
                }
            }
            if (move == 's') {
                if (row + 1 < height) {
                    player.setCoordinates(row + 1, column);
                }
            }
            if (move == 'a') {
                if (column - 1 >= 0) {
                    player.setCoordinates(row, column - 1);
                }
            }
            if (move == 'd') {
                if (column + 1 < length) {
                    player.setCoordinates(row, column + 1);
                }
            }
    }

    public void moveVampires() {
        Random random = new Random();
        char[] moveOptions = new char[]{'w', 's', 'a', 'd'};
        Set<Coordinate> toBeRemoved = new HashSet<>();

        for (Coordinate coordinate : vampirePositions.getVampireCoordinates()) {
            char move = moveOptions[random.nextInt(moveOptions.length)];
            int row = coordinate.getRow();
            int column = coordinate.getColumn();

            if (move == 'w') {
                if (row - 1 >= 0) {
                    if (player.getCoordinates().equals(coordinate)) {
                        toBeRemoved.add(coordinate);
                    }
                    else if (!vampirePositions.containsCoordinate(new Coordinate(row-1,column))){
                        coordinate.setRow(row - 1);
                    }
                }
            }
            if (move == 's') {
                if (row + 1 < height) {
                    if (player.getCoordinates().equals(coordinate)) {
                        toBeRemoved.add(coordinate);
                    }
                    else if (!vampirePositions.containsCoordinate(new Coordinate(row+1,column))){
                        coordinate.setRow(row + 1);
                    }
                }
            }
            if (move == 'a') {
                if (column - 1 >= 0) {
                    if (player.getCoordinates().equals(coordinate)) {
                        toBeRemoved.add(coordinate);
                    }
                    else if (!vampirePositions.containsCoordinate(new Coordinate(row,column-1))){
                        coordinate.setColumn(column - 1);
                    }
                }
            }
            if (move == 'd') {
                if (column + 1 < length) {
                    if (player.getCoordinates().equals(coordinate)) {
                        toBeRemoved.add(coordinate);
                    }
                    else if (!vampirePositions.containsCoordinate(new Coordinate(row,column+1))){
                        coordinate.setColumn(column + 1);
                    }
                }
            }
        }
        vampirePositions.removeCoordinates(toBeRemoved);

    }

    public void printDungeon() {
        System.out.println(player);
        System.out.println(vampirePositions);
        for (String mapRow : mapLayout.values()) {
                System.out.println(mapRow);
            }
            System.out.println();
        }
    }

