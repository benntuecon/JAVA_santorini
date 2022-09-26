import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

    public String name;
    public List<Worker> workerList;
    private boolean isLose;

    public boolean getIsLose(){
        return isLose;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public boolean placeWorker(Board board, int x, int y){
        if (board.placeWorker(this,x,y) == null){
            return false;
        }

        Cell cell = board.placeWorker(this,x,y);

        Worker worker = new Worker(cell, this);
        this.workerList.add(worker);
        return true;
    }

    public Map<Worker,List<List<Integer>>> getPotentialMove(){
        Map<Worker,List<List<Integer>>> ret = new HashMap<>();
        for (Worker worker : this.workerList){
        }

        return ret;
    }
}
