package OOP.sem1;

/*
Крестьянин	Разбойник	Снайпер	Колдун
копейщик	арбалетчик	монах
 */

/*
 * Monk heal unlimited mana cant move
 * Crossbower cant move shot
 * Pikeman move front-side attack mellee
 * Wizard - monk analogy
 * Sniper cb analog shot cant move
 * Rogue move attack
 * Peasant cant move cant heal carry bows for cb and sniper

 *
 Peasant Robber Sniper Sorcerer
spearman crossbowman monk
 *
 * */

import java.util.ArrayList;

public abstract class Hero {

    protected int health, healthMax, armor;

    protected int[] damage;
    protected String nameHero;
    protected Vector2 position;
    public Hero(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);
    }
    public void printEnemysDistance(ArrayList<Hero> enemys){
        enemys.forEach(n-> System.out.print(position.rangeEnemy(n.position)+", "));
        System.out.println();
    }

}



