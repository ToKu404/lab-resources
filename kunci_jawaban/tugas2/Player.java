public class Player {
    private String name;
    private int level;
    private int health;
    private int mana;
    private int experience;

    public Player() {
    }

    public Player(String name, int level, int health, int mana, int experience) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.experience = experience;
    }

    public void attack() {
        System.out.println("Player " + name + " is attacking!");
        // implement attack logic here
    }

    public void heal(int amount) {
        health += amount;
        System.out.println("Player " + name + " is healing " + amount + " health points!");
    }

    public void gainExperience(int amount) {
        experience += amount;
        System.out.println("Player " + name + " gained " + amount + " experience points!");
        // implement level up logic here
    }

    public void displayStats() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Level: " + level);
        System.out.println("Player Health: " + health);
        System.out.println("Player Mana: " + mana);
        System.out.println("Player Experience: " + experience);
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
