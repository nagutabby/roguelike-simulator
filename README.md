# roguelike-simulator
## How to compile and run
1. Install the VSCode extension called `Extension Pack for Java`
2. Open `Main.java`
3. Click the run button in the top right corner

## Description of programs
- Main.java
  - The entry point that simulate the roguelike game
- Character.java
  - Define `Character` class
  - `Character` class is the super class of `Enemy` and `Player` class
- Enemy.java
  - Define `Enemy` class
- EnemyType.java
  - Define an Enum called `EnemyType`
- Player.java
  - Define `Player` class
- Item.java
  - Define `Item` class
  - `Item` class is an abstract class
  - `Item` class is the super class of `Consumable` and `Weapon` class
- Consumable.java
  - Define `Consumable` class that represents consumable such as recovery item
- Weapon.java
  - Define `Weapon` class that represents weapon such as sword
- Inventory.java
  - Define `Inventory` class
  - `Inventory` class has a list of `Item` objects
- Floor.java
  - Define `Floor` class
- Dungeon.java
  - Define `Dungeon` class
  - `Dungeon` class has a list of `Floor` objects and an iterator of the list


