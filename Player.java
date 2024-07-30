public class Player extends Character{
    private Inventory inventory;
    private Floor currentFloor;

    public Player(String name, int hp, int atk, int positionX, int positionY, Inventory inventory, Floor currentFloor) {
        super(name, hp, atk, positionX, positionY);
        this.inventory = inventory;
        this.currentFloor = currentFloor;
    }

    public void pickUpItem(Item item) {
        System.out.println(this.name + "は" + item.name + "を拾った");
        System.out.println();
        this.inventory.addItem(item);

    }

    public void useItem(Item item) {
        if (item instanceof Consumable) {
            Consumable consumable = (Consumable)item;
            System.out.println(this.name + "は" + item.name + "を使った");
            System.out.println("体力が" + consumable.getHealAmount() + "回復した");
            System.out.println();
        } else if (item instanceof Weapon) {
            Weapon weapon = (Weapon)item;
            System.out.println(this.name + "は" + item.name + "を装備した");
            System.out.println("攻撃力が" + weapon.getAtk() + "上がった");
            System.out.println();
        }
        item.apply(this);
        this.inventory.removeItem(item);
    }

    public Floor moveToNextFloor(Dungeon dungeon) {
        Floor lastFloor = dungeon.getFloors().get(dungeon.getFloorSize() - 1);
        if (dungeon.floorIterator.hasNext()) {
            this.currentFloor = dungeon.floorIterator.next();
            System.out.println(this.name + "は次の階層に進んだ");
            System.out.println();
        }

        if (this.currentFloor == lastFloor) {
            System.err.println("ダンジョンをクリアした！");
            System.exit(0);
        }

        return this.currentFloor;
    }

    public Floor getCurrentFloor() {
        return this.currentFloor;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
}
