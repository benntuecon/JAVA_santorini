import java.lang.reflect.Array;
import java.util.List;

/*
* status : if equal or greater than 0, means levels, if == -1 means domed
*
*
* */
public class Cell {
    public Boolean occupied;
    public List<PlaceAble> things;
    private Board board;
    private Cell[] adjList;
    private int[] pos;


    public Cell(int n, int m, Board b){
        this.pos = new int[2];
        this.pos[0] = n;
        this.pos[1] = m;
        this.board = b;
    }

    public Cell[] getAdjList() {
        return adjList;
    }

    public int[] getPos() {
        return pos;
    }

    public void setAdjList(List<Cell> cells) {
        this.adjList = cells.toArray(new Cell[cells.size()]);
    }

    public void addThings(PlaceAble thing){
    }
}
