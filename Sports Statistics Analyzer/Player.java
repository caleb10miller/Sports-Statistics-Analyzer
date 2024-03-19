public abstract class Player {
    protected String name;
    protected int age;
    protected String team;
    protected String position;

    // constructor
    public Player(String name, int age, String team, String position){
        this.name = name;
        this.age = age;
        this.team = team;
        this.position = position;

    }
    
    //abstract method
    public abstract void printStats();

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getTeam(){
        return team;
    }
    public void setTeam(String team){
        this.team = team;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
}