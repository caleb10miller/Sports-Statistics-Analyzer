public class WhiteBoxTesting {
    public static void main(String[] args) throws Exception {
        // formatting
        System.out.println();

        // testing FootballPlayer.java
        System.out.println("Testing FootballPlayer.java:\n\n");
        FootballPlayer myQB = new FootballPlayer("Tua Tagoviloa", 26, "Dolphins", "QB", 3700, 35);
        System.out.println("New football player created. Stats should print below: \n");
        System.out.println("Shoud be Tua Tagoviloa - 26 - Dolphins - QB - 3700 - 35");
        myQB.printStats();
        System.out.println("\n");

        System.out.println("Creating invalid football player below: \n");
        try {
            FootballPlayer badQB = new FootballPlayer("bad", -1, "Chargers", "QB", -1000, -100);
            badQB.printStats();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n\n");
        }

        // testing BasketballPlayer.java
        System.out.println("Testing BasketballPlayer.java:\n\n");
        BasketballPlayer mySF = new BasketballPlayer("Lebron James", 39, "Lakers", "SF", 27, 7, 7);
        System.out.println("New basketball player created. Stats should print below: \n");
        System.out.println("Shoud be Lebron James - 39 - Lakers - SF - 27 - 7 - 7");
        mySF.printStats();
        System.out.println("\n");

        System.out.println("Creating invalid basketball player below: \n");
        try {
            BasketballPlayer badSF = new BasketballPlayer("bad", -1, "Lakers", "SF", -30, -10, -10);
            badSF.printStats();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n\n");
        }

        // testing StatsDisplayable.java
        System.out.println("Testing StatsDisplayable.java:\n\n");
        System.out.println("Polymorphism of printStats - \n\n");
        System.out.print("Printing football player stats using .printStats: "); 
        myQB.printStats();
        System.out.println();
        System.out.print("Printing basketball player stats using .printStats: "); 
        mySF.printStats();
        System.out.println("\n");


        // testing Player.java
        System.out.println("Testing Player.java:\n\n");
        System.out.print("Testing printStats - ");
        myQB.printStats();
        System.out.println();
        System.out.println("Testing getters - \n");
        System.out.println("My qb's name is: " + myQB.getName());
        System.out.println("His age is: " + myQB.getAge());
        System.out.println("His team is: " + myQB.getTeam());
        System.out.println("And his position is: " + myQB.getPosition());
        System.out.println();
        System.out.println("Testing setters - \n");
        myQB.setName("Saquon Barkley");
        System.out.println("New name should now be Saquon Barkley");
        myQB.setAge(27);
        System.out.println("New age should now be 27");
        myQB.setTeam("Eagles");
        System.out.println("New team should now be the Eagles");
        myQB.setPosition("RB");
        System.out.println("New position should now be RB\n");
        System.out.println("Below is the updated football player (using setters): \n");
        myQB.printStats();
        System.out.println();

        // Professor Bewley said we do not need to whitebox test Driver file
        // I spoke to her about this on March 14 in class
    }
}
