package OOP.sem1;

public class Monk extends Hero{

    public Monk(String nameHero, int posX, int posY) {
        super(50, 50, 1, new int[]{-35, -30}, nameHero, posX, posY);
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Монах: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }
}
