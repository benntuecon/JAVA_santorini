public class Worker extends PlaceAble {

    public Player belongsTo;

    public Worker(Cell c, Player player) {
        this.at = c;
        this.isOccupying  = true;
        this.belongsTo = player;
    }
}
