package src;

public class Controller {

    GameBoard gameBoard = new GameBoard();

    public void beginGame(){



    }

    public void playGame() {


    }

    public void playRound(Player player, int playerInput) {
        do {
            //TODO: test whether this works
            int row = (playerInput / 3) - 1;
            int col = (playerInput % 3) - 1;
            //TODO: add attribute heads or tails to player?
            gameBoard.setSpace(row, col, 't');

        } while (gameBoard.getIsGameOver() == false);
    }

    // prints out the current state of gameboard
    public void visualizeGameBoard(GameBoard gameBoard) {

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                System.out.print("||");
                System.out.print(gameBoard.getSpaces()[row][col]);

            }
            System.out.print("||\n-----------\n");
        }

    }
}
