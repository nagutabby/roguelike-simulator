public class Weapon extends Item{
    private int atk;

    public Weapon(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }

    @Override
    public void apply(Character character) {
        character.atk += this.atk;
    }

    public int getAtk() {
        return this.atk;
    }
}
