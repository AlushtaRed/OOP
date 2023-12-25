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

public abstract class Hero {

    protected int health, healthMax, armor;
    protected int[] damage;
    protected String nameHero;

    public Hero(int health, int healthMax, int armor, int[] damage, String nameHero) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
    }

}



