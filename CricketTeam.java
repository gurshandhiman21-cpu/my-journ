abstract class Player {
    String name;
    int jerseyNo;
    Player(String name, int no) { this.name = name; this.jerseyNo = no; }
    abstract void play();
    void display() { System.out.println("#" + jerseyNo + " " + name); }
}
class Batsman extends Player {
    int runs;
    Batsman(String name, int no, int runs) { super(name, no); this.runs = runs; }
    void play() { System.out.println(name + " scored " + runs + " runs."); }
}
class Bowler extends Player {
    int wickets;
    Bowler(String name, int no, int wickets) { super(name, no); this.wickets = wickets; }
    void play() { System.out.println(name + " took " + wickets + " wickets."); }
}
class AllRounder extends Player {
    int runs, wickets;
    AllRounder(String name, int no, int runs, int wickets) {
        super(name, no); this.runs = runs; this.wickets = wickets;
    }
    void play() { System.out.println(name + " scored " + runs + " runs and took " + wickets + " wickets."); }
}
public class CricketTeam {
    public static void main(String[] args) {
        Player[] team = {
            new Batsman("Kohli", 18, 95),
            new Bowler("Bumrah", 93, 3),
            new AllRounder("Jadeja", 8, 45, 2)
        };
        for (Player p : team) { p.display(); p.play(); System.out.println(); }
    }
}
