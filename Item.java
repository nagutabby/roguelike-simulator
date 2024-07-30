public abstract class Item {
    protected String name;

    public abstract void apply(Character character);

    public String getName() {
        return this.name;
    }
}
