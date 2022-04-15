package puzzles.hoppers.model;

public class Frog {
    private int row;
    private int col;

    public Frog(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
}