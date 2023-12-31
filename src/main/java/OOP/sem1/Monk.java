package OOP.sem1;

import OOP.sem1.Interfaces.Healer;

import java.util.Random;

public class Monk extends Hero implements Healer {

    public Monk(String nameHero, int posX, int posY) {
        super(50, 50, 1, new int[]{-35, -30}, nameHero, posX, posY);
        Vector2 position;
    }
    Random random = new Random();
    @Override
    public String toString() {
        return ("Монах: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }

    @Override
    public void getHealing(Hero target) {
        target.health = target.health + random.nextInt(damage[0], damage[1]);
    }
}
