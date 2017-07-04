import java.util.ArrayList;

/**
 * Created by Jeannette on 11/05/2017.
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize = 16;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player person) {

        if (players.size() < this.maxSize) {
            players.add(person);
        }
    }

    public void printPlayers() {
        for (Player person: players) {
            System.out.println("" + person.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player person: players) {
            totalGoals += person.goals();
        }
        return totalGoals;
    }
}
