package OOP.sem1;


public class Rogue extends Hero {

    public Rogue(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{20, 30}, nameHero, posX, posY);
    }

    protected Vector2 position;


    @Override
    public String toString() {
        return ("Разбойник: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }
}
