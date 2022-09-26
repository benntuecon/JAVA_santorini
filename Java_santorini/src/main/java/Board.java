import java.util.ArrayList;
import java.util.List;

public class Board {
    private int n, m;
    private Cell[][] cells;


    public Board(int n, int m){
        this.n = n;
        this.m = m;
        initCell();
        initAdjListOfAllCell();
    }
    private void initCell(){
        for(int i = 0; i < n; i++){
            for (int j = 0; j <m; j++){
                cells[i][j] = new Cell(i, j ,this);
            }
        }
    }

    private void initAdjListOfAllCell(){
        for(int i = 0; i < n; i++){
            for (int j = 0; j <m; j++){
                int[][] dirs = {{i+1,j+0 },
                                {i+1,j+1 },
                                {i+1,j-1 },
                                {i-1,j+0 },
                                {i-1,j+1 },
                                {i-1,j-1 },
                                {i+0,j+1 },
                                {i+0,j-1 },
                                };
                List<Cell> adjList = new ArrayList<>();

                for(int s = 0; s<dirs.length; s ++ ){
                    if(dirs[s][0] >=0 && dirs[s][0] < n &&dirs[s][1] >=0 && dirs[s][1] <m ){
                        adjList.add(cells[dirs[s][0]][dirs[s][1]]);
                    }
                }
                cells[i][j].setAdjList(adjList);
            }
        }
    }
    public boolean isOccupied(int x, int y){
        return cells[x][y].occupied;
    }

    public Cell placeWorker(Player player, int x, int y){
        if(this.isOccupied(x,y)){
            return null;
        }
        // check the player list
        if (player.workerList.size() == 2){
            return null;
        }
        return cells[x][y];
    }
}
