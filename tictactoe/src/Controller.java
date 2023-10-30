package src;

public class Controller {

    GameBoard gameBoard = new GameBoard();

    public void beginGame(){

        GameBoard gameBoard = new GameBoard();

    }

    public void playGame() {




    }

    // prints out the current state of gameboard
    public void visualizeGameBoard() {

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                System.out.print("||");
                System.out.print(gameBoard.getSpaces()[row][col]);

            }
            System.out.print("||\n-----------\n");
        }

    }
}
