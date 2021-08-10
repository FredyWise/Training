package Project01;

// player
class player{
    String name;
    int health;
    int level;
    // object member
    weapon weapon;
    armor armor;
    // constructor
    player(String name, int health, int lvl){
        this.name = name;
        this.health = health;
        this.level = lvl;
    }
    
    void attacking(player opponent){
        System.out.println(this.name + " attacking " + opponent.name);
        opponent.defence(this.weapon.attackP);
    }
    void defence(double attackP){
        double damage;
        if (this.armor.defenceP < attackP) {
            damage = attackP - (10% this.armor.defenceP);
        } else {
            damage = attackP - (90% this.armor.defenceP);
        }
        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }
    void equipW(weapon sword){
        this.weapon = sword;
    }
    void equipA(armor chestplate){
        this.armor = chestplate;
    }
    void display(){
        System.out.println("\nLVL : " + this.level);
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health + "HP");
        this.weapon.display();
        this.armor.display();
    }
}

// weapon
class weapon{
    String name;
    double attackP;

    weapon(String name, double attack){
        this.attackP = attack;
        this.name = name;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " Power : " + this.attackP);
    }
}

// armor
class armor{
    String name;
    double defenceP;

    armor(String name ,double defence){
        this.name = name;
        this.defenceP = defence;
    }

    void display(){
        System.out.println("Armor : " + this.name + " Defence : " + this.defenceP);
    }
}

public class Main {
    public static void main(String[] args) {
        // object player
        player player1 = new player("bijix",300,50);
        player player2 = new player("babi", 230,30);
        // object weapon
        weapon sword = new weapon("durandal",25);
        weapon hammer = new weapon("rock",21);
        // object armor
        armor chestplate = new armor("swan",20);
        armor leggings = new armor("leaf", 16);
        // equipment P1
        player1.equipW(sword);
        player1.equipA(chestplate);
        player1.display();
        // equipment P2
        player2.equipW(hammer);
        player2.equipA(leggings);
        player2.display();     
        // battling
        Battle(player1,player2);
        
    }
    // battling player
    public static void Battle(player player01, player player02) {
        int a=1;
        String winner;
        System.out.println("\nBattle !!!");
        while (player01.health > 0 && player02.health > 0) {
            System.out.println("\nPart " + a);a++;
            player01.attacking(player02);
            if (player02.health < 0){
                player02.health = 0;
            }player02.display();
            if (player02.health > 0){
                System.out.println("\nPart " + a);a++;
                player02.attacking(player01);
                if (player01.health < 0){
                    player01.health = 0;
                }player01.display();
            }
        }
        if (player01.health != 0) {
            winner = player01.name;
        } else {
            winner = player02.name;
        }
        System.out.println("The Winner is " + winner);
    }
}