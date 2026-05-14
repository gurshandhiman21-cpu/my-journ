abstract class GameCharacter {
    String name;
    int health;
    int attackPower;
    GameCharacter(String name, int health, int attack) {
        this.name = name; this.health = health; this.attackPower = attack;
    }
    abstract void specialAbility();
    void attack() { System.out.println(name + " attacks with " + attackPower + " damage!"); }
    void display() { System.out.println("Name: " + name + " | HP: " + health + " | ATK: " + attackPower); }
}
class Warrior extends GameCharacter {
    Warrior(String name) { super(name, 200, 80); }
    void specialAbility() { System.out.println(name + " uses SHIELD BASH!"); }
}
class Mage extends GameCharacter {
    Mage(String name) { super(name, 120, 150); }
    void specialAbility() { System.out.println(name + " casts FIREBALL!"); }
}
class Archer extends GameCharacter {
    Archer(String name) { super(name, 150, 100); }
    void specialAbility() { System.out.println(name + " fires ARROW STORM!"); }
}
public class GameCharacter {
    public static void main(String[] args) {
        GameCharacter[] team = { new Warrior("Thor"), new Mage("Merlin"), new Archer("Legolas") };
        for (GameCharacter c : team) { c.display(); c.attack(); c.specialAbility(); System.out.println(); }
    }
}
