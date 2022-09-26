public class Game {
    public Board board;
    public Player[] players;

    public Board startGame(int n, int m){
        return new Board(n,m);
    }



}
