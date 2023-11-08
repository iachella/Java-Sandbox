package src;

public class GameBoard {

    private char[][] spaces;
    private boolean isGameOver;

    /** initializes a gameboard size 3x3 with '#' as empty space */
    public GameBoard(){

        this.spaces = new char[3][3];
        this.isGameOver = false;

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                this.setSpace(row, col, '#');
            }
        }

    }

    // sets space at desired position with specified value
    public void setSpace(int row, int col, char value){
        this.spaces[row][col] = value;
    }

    public char[][] getSpaces() {
        return spaces;
    }

    public void setSpaces(char[][] spaces) {
        this.spaces = spaces;
    }

    public boolean getIsGameOver() {
        return isGameOver;
    }

    public void setIsGameOver(boolean isGameOver) {
        this.isGameOver = isGameOver;
    }
}
