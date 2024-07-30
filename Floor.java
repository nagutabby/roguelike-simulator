import java.util.ArrayList;
import java.util.List;

public class Floor {
    private List<Enemy> enemies = new ArrayList<>();
    private List<Item> items = new ArrayList<>();

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemies.indexOf(enemy));
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(items.indexOf(item));
    }

    public List<Enemy> getEnemies() {
        return this.enemies;
    }
}
