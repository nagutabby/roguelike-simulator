import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Floor firstFloor = new Floor();
        Floor secondFloor = new Floor();
        Floor thirdFloor = new Floor();

        ArrayList<Floor> floors = new ArrayList<>(Arrays.asList(firstFloor, secondFloor, thirdFloor));

        Dungeon dungeon = new Dungeon(floors);
        Inventory inventory = new Inventory();
        Player player = new Player("勇者", 100, 20, 0, 0, inventory, dungeon.getFloors().get(0));

        Enemy goblin = new Enemy("ゴブリン", 30, 10, 5, 0, EnemyType.NORMAL);
        Enemy dragon = new Enemy("ドラゴン", 200, 30, 0, 5, EnemyType.BOSS);


        Floor currentFloor = player.getCurrentFloor();
        currentFloor.addEnemy(goblin);

        Consumable healthPotion = new Consumable("回復のポーション", 50);

        player.pickUpItem(healthPotion);
        goblin.move(4, 0);
        player.move(1, 0);
        goblin.move(3, 0);
        player.move(2, 0);
        player.attack(goblin);
        goblin.attack(player);
        player.attack(goblin);
        currentFloor.removeEnemy(goblin);
        player.useItem(healthPotion);

        currentFloor = player.moveToNextFloor(dungeon);

        currentFloor.addEnemy(dragon);

        Weapon slayersBlade = new Weapon("討魔の刃", 20);
        Consumable superHealthPotion = new Consumable("超回復のポーション", 100);

        player.move(1, 0);
        dragon.move(0, 4);
        player.pickUpItem(superHealthPotion);
        dragon.move(0, 3);
        dragon.move(0, 2);
        player.pickUpItem(slayersBlade);
        player.move(0, 0);
        dragon.move(0, 1);
        player.attack(dragon);
        dragon.attack(player);
        player.useItem(slayersBlade);
        dragon.attack(player);
        player.attack(dragon);
        dragon.attack(player);
        player.attack(dragon);
        dragon.attack(player);
        player.attack(dragon);
        player.useItem(superHealthPotion);
        dragon.attack(player);
        player.attack(dragon);
        dragon.attack(player);
        player.attack(dragon);
    }
}
