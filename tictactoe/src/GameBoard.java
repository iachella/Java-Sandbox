package src;

public class GameBoard {

    private char[][] spaces;

    public GameBoard(){

        this.spaces = new char[3][3];

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                this.setSpace(row, col, '#');
            }
        }

    }

    public void setSpace(int row, int col, char value){
        this.spaces[row][col] = value;
    }

    public char[][] getSpaces() {
        return spaces;
    }

    public void setSpaces(char[][] spaces) {
        this.spaces = spaces;
    }
}