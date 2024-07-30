import java.util.List;
import java.util.ListIterator;

public class Dungeon {
    private List<Floor> floors;

    public ListIterator<Floor> floorIterator;

    public Dungeon(List<Floor> floors) {
        this.floors = floors;
        this.floorIterator = this.floors.listIterator();
    }

    public int getFloorSize() {
        return this.floors.size();
    }

    public List<Floor> getFloors() {
        return this.floors;
    }
}
