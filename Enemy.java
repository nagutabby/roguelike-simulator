public class Enemy extends Character{
    private EnemyType type;

    public Enemy(String name, int hp, int atk, int positionX, int positionY, EnemyType type) {
        super(name, hp, atk, positionX, positionY);
        this.type = type;
    }

    public EnemyType getType() {
        return this.type;
    }
}
