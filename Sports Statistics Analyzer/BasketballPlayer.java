public class BasketballPlayer extends Player implements StatsDisplayable {
    private int points;
    private int rebounds;
    private int assists;

    public BasketballPlayer(String name, int age, String team, String position, int points, int rebounds, int assists){
        super(name, age, team, position);
        if (age < 0 || points < 0 || rebounds < 0 || assists < 0) {
            throw new IllegalArgumentException("Age, Points, Rebounds, and Assists cannot be negative");
        }
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
    }

    @Override
    public void printStats(){
        System.out.println("Basketball Player: " + name + " | Age: " + age + " | Team: " + team + " | Position: " + position + " | Points: " + points + " | Rebounds: " + rebounds + " | Assists: " + assists);
    }
}
