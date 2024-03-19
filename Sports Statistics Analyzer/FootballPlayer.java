public class FootballPlayer extends Player implements StatsDisplayable {
    private int totalYards;
    private int touchdowns;

    public FootballPlayer(String name, int age, String team, String position, int totalYards, int touchdowns){
        super(name, age, team, position);
        if (age < 0 || totalYards < 0 || touchdowns < 0) {
            throw new IllegalArgumentException("Age, TotalYards, and Touchdowns cannot be negative");
        }
        this.totalYards = totalYards;
        this.touchdowns = touchdowns;
    }

    @Override
    public void printStats(){
        System.out.println("Football Player: " + name + " | Age: " + age + " | Team: " + team + " | Position: " + position + " | Total Yards: " + totalYards + " | Touchdowns: " + touchdowns);
    }
}
