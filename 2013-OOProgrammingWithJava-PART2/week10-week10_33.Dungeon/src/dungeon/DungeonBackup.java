
package dungeon;

import java.util.*;

public class DungeonBackup {
    private int length;
    private int height;
    private int vampires;
    private int movesAvailable;
    private boolean vampiresMove;
    private Map<Integer, String[]> mapLayout;
    private Coordinate playerCoordinates = new Coordinate(0,0);
    private List<Coordinate> vampireCoordinates;
    private String vampMoves = "";



    public DungeonBackup(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.movesAvailable = moves;
        this.vampiresMove = vampiresMove;
        this.vampireCoordinates = new ArrayList<>();
        this.mapLayout = new HashMap<>();
    }

    public String getVampMoves() {
        return vampMoves;
    }

    public int getMovesAvailable() {
        return movesAvailable;
    }

    public void mapStart() {
        for (int i = 0; i < height; i++) {
            mapLayout.put(i, new String[length]);
            for (int j = 0; j < length; j++) {
                mapLayout.get(i)[j] = ".";
            }
        }
        mapLayout.get(0)[0] = "@";
        startPositionVampires();
    }

    public void startPositionVampires() {
        int vampiresPositioned = vampires;
        Random vampirePosition = new Random();
        while (vampiresPositioned > 0) {
            int row = vampirePosition.nextInt(length);
            int column = vampirePosition.nextInt(height);
            if (!mapLayout.get(row)[column].equals("v") && !mapLayout.get(row)[column].equals("@")) {
                mapLayout.get(row)[column] = "v";
                vampireCoordinates.add(new Coordinate(row, column));
                vampiresPositioned--;
            }
        }
    }

    public void Move(String string) {
        String movesPlayer = string;

        for (int i = 0; i < movesPlayer.length(); i++) {
            movePlayer(movesPlayer.charAt(i));
            moveVampires();
        }
    }

    public void movePlayer(char move) {

        if (move == 'w') {
            mapLayout.get(playerCoordinates.getRow()-1)[playerCoordinates.getColumn()] = "@";
            mapLayout.get(playerCoordinates.getRow())[playerCoordinates.getColumn()] = ".";
            playerCoordinates.setRow(playerCoordinates.getRow()-1);
        }

        if (move == 's') {
            mapLayout.get(playerCoordinates.getRow()+1)[playerCoordinates.getColumn()] = "@";
            mapLayout.get(playerCoordinates.getRow())[playerCoordinates.getColumn()] = ".";
            playerCoordinates.setRow(playerCoordinates.getRow()+1);
        }

        if (move == 'a') {
            mapLayout.get(playerCoordinates.getRow())[playerCoordinates.getColumn()-1] = "@";
            mapLayout.get(playerCoordinates.getRow())[playerCoordinates.getColumn()] = ".";
            playerCoordinates.setColumn(playerCoordinates.getColumn()-1);
        }


        if (move == 'd') {
            mapLayout.get(playerCoordinates.getRow())[playerCoordinates.getColumn()+1] = "@";
            mapLayout.get(playerCoordinates.getRow())[playerCoordinates.getColumn()] = ".";
            playerCoordinates.setColumn(playerCoordinates.getColumn()+1);
        }

    }

    public void positionVampires() {
        int vampiresPositioned = vampireCoordinates.size();
        Random vampirePosition = new Random();
        while (vampiresPositioned > 0) {
            int row = vampirePosition.nextInt(length);
            int column = vampirePosition.nextInt(height);
            if (!mapLayout.get(row)[column].equals("v") && !mapLayout.get(row)[column].equals("@")) {
                mapLayout.get(row)[column] = "v";
                vampireCoordinates.add(new Coordinate(row, column));
                vampiresPositioned--;
            }
        }
    }

    public void moveVampires() {
        Random random = new Random();
        char[] moveOptions = new char[] {'w', 's', 'a', 'd'};
        List<Coordinate> toBeRemoved = new ArrayList<>();
        List<Coordinate> toBeAdded = new ArrayList<>();

        /*System.out.println("vc before before: ");
        for (Coordinate coordinate : vampireCoordinates) {
            System.out.print(coordinate + " ");
        }*/
        String vmoves = "";

        for (Coordinate coordinate : vampireCoordinates) {
            char move = moveOptions[random.nextInt(moveOptions.length)];
            vmoves += move;

            if (move == 'w') {
                if (coordinate.getRow() - 1 >= 0) {

                    if (mapLayout.get(coordinate.getRow() - 1)[coordinate.getColumn()] == "@") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        toBeRemoved.add(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
                    } else if (mapLayout.get(coordinate.getRow() - 1)[coordinate.getColumn()] == ".") {
                        mapLayout.get(coordinate.getRow() - 1)[coordinate.getColumn()] = "v";
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        coordinate.setRow(coordinate.getRow() - 1);
                    }
                }
            }

            if (move == 's') {
                if (coordinate.getRow() + 1 < height) {

                    if (mapLayout.get(coordinate.getRow() + 1)[coordinate.getColumn()] == "@") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        toBeRemoved.add(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
                    } else if (mapLayout.get(coordinate.getRow() + 1)[coordinate.getColumn()] == ".") {
                        mapLayout.get(coordinate.getRow() + 1)[coordinate.getColumn()] = "v";
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        coordinate.setRow(coordinate.getRow() + 1);
                    }
                }

            }

            if (move == 'a') {
                if (coordinate.getColumn() - 1 >= 0) {

                    if (mapLayout.get(coordinate.getRow())[coordinate.getColumn() - 1] == "@") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        toBeRemoved.add(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
                    } else if (mapLayout.get(coordinate.getRow())[coordinate.getColumn() - 1] == ".") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn() - 1] = "v";
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        coordinate.setColumn(coordinate.getColumn() - 1);
                    }
                }
            }

            if (move == 'd') {
                if (coordinate.getColumn() + 1 < length) {


                    if (mapLayout.get(coordinate.getRow())[coordinate.getColumn() + 1] == "@") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        toBeRemoved.add(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
                    } else if (mapLayout.get(coordinate.getRow())[coordinate.getColumn() + 1] == ".") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn() + 1] = "v";
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        coordinate.setColumn(coordinate.getColumn() + 1);
                    }
                }
            }
            vampMoves += (vmoves + " ");
        }
        /*System.out.println();
        System.out.println("toberemoved: ");
        for (Coordinate coordinate : toBeRemoved) {
            System.out.print(coordinate + " ");
        }
        System.out.println();
        System.out.println("tobeadded: ");
        for (Coordinate coordinate : toBeAdded) {
            System.out.print(coordinate + " ");
        }*/

        vampireCoordinates.removeAll(toBeRemoved);
        //System.out.println();
        /*System.out.println("vc before: ");
        for (Coordinate coordinate : vampireCoordinates) {
            System.out.print(coordinate + " ");
        }
        System.out.println();*/
    }

    /*public void moveVampires() {
        Random random = new Random();
        char[] moveOptions = new char[] {'w', 's', 'a', 'd'};
        List<Coordinate> toBeRemoved = new ArrayList<>();
        List<Coordinate> toBeAdded = new ArrayList<>();

        /*System.out.println("vc before before: ");
        for (Coordinate coordinate : vampireCoordinates) {
            System.out.print(coordinate + " ");
        }
        String vmoves = "";

        for (Coordinate coordinate : vampireCoordinates) {
            char move = moveOptions[random.nextInt(moveOptions.length)];
            vmoves += move;

            if (move == 'w') {
                if (coordinate.getRow() - 1 >= 0) {

                    if (mapLayout.get(coordinate.getRow() - 1)[coordinate.getColumn()] == "@") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        toBeRemoved.add(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
                    } else if (mapLayout.get(coordinate.getRow() - 1)[coordinate.getColumn()] == ".") {
                        mapLayout.get(coordinate.getRow() - 1)[coordinate.getColumn()] = "v";
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        coordinate.setRow(coordinate.getRow() - 1);
                    }
                }
            }

            if (move == 's') {
                if (coordinate.getRow() + 1 < height) {

                    if (mapLayout.get(coordinate.getRow() + 1)[coordinate.getColumn()] == "@") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        toBeRemoved.add(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
                    } else if (mapLayout.get(coordinate.getRow() + 1)[coordinate.getColumn()] == ".") {
                        mapLayout.get(coordinate.getRow() + 1)[coordinate.getColumn()] = "v";
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        coordinate.setRow(coordinate.getRow() + 1);
                    }
                }

            }

            if (move == 'a') {
                if (coordinate.getColumn() - 1 >= 0) {

                    if (mapLayout.get(coordinate.getRow())[coordinate.getColumn() - 1] == "@") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        toBeRemoved.add(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
                    } else if (mapLayout.get(coordinate.getRow())[coordinate.getColumn() - 1] == ".") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn() - 1] = "v";
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        coordinate.setColumn(coordinate.getColumn() - 1);
                    }
                }
            }

            if (move == 'd') {
                if (coordinate.getColumn() + 1 < length) {


                    if (mapLayout.get(coordinate.getRow())[coordinate.getColumn() + 1] == "@") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        toBeRemoved.add(new Coordinate(coordinate.getRow(), coordinate.getColumn()));
                    } else if (mapLayout.get(coordinate.getRow())[coordinate.getColumn() + 1] == ".") {
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn() + 1] = "v";
                        mapLayout.get(coordinate.getRow())[coordinate.getColumn()] = ".";
                        coordinate.setColumn(coordinate.getColumn() + 1);
                    }
                }
            }
            vampMoves += (vmoves + " ");
        }
        /*System.out.println();
        System.out.println("toberemoved: ");
        for (Coordinate coordinate : toBeRemoved) {
            System.out.print(coordinate + " ");
        }
        System.out.println();
        System.out.println("tobeadded: ");
        for (Coordinate coordinate : toBeAdded) {
            System.out.print(coordinate + " ");
        }

        vampireCoordinates.removeAll(toBeRemoved);
        //System.out.println();
        /*System.out.println("vc before: ");
        for (Coordinate coordinate : vampireCoordinates) {
            System.out.print(coordinate + " ");
        }
        System.out.println();
    }*/

    public void printDungeon() {
        for (String[] mapRow : mapLayout.values()) {
            for (String string : mapRow) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
