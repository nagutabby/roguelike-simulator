public class Consumable extends Item {
    private int healAmount;

    public Consumable(String name, int healAmount) {
        this.name = name;
        this.healAmount = healAmount;
    }

    @Override
    public void apply(Character character) {
        character.hp += this.healAmount;
    }

    public int getHealAmount() {
        return this.healAmount;
    }
}
