public class Character {
    protected String name;
    protected int hp;
    protected int atk;
    protected int positionX;
    protected int positionY;

    public Character(String name, int hp, int atk, int positionX, int positionY) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void move(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        System.out.println(this.name + "は x: " + this.positionX + ", y: " + this.positionY + " に進んだ");
        System.out.println();
    }

    private boolean is_attackable(Character character) {
        return Math.abs(this.positionX - character.positionX) <= 1 && Math.abs(this.positionY - character.positionY ) <= 1;
    }

    public void attack(Character character) {
        if (this.is_attackable(character)) {
            System.out.println(this.name + "の攻撃:");
            character.hp -= this.atk;
            System.out.println(character.name + "に" + this.atk + "ダメージを与えた");
            if (character.hp <= 0) {
                if (character instanceof Enemy) {
                    Enemy enemy = (Enemy)character;
                    System.out.println(character.name + "を倒した！");
                    if (enemy.getType() == EnemyType.BOSS) {
                        System.out.println("ダンジョンをクリアした！");
                        System.exit(0);
                    } else {
                        System.out.println();
                    }
                } else if (character instanceof Player) {
                    System.out.println(this.name + "に倒されてしまった…");
                    System.exit(0);
                }
            } else {
                System.out.println();
            }
        } else {
            System.out.println(this.name + "は" + character.name + "に攻撃できない");
        }
    }
}
