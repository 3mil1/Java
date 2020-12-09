import java.util.ArrayList;

public class Team {
    String name;
    private final ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return this.name.toString();
    }

    public void addPlayer(Player name) {
        this.players.add(name);
    }

    public void printPlayers() {
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;

    }

    public int size() {
        return maxSize;
    }

    public int goals(){
        int amount = 0;
        for(Player p : this.players){
            amount += p.goals();
        }
        return amount;
    }

}
