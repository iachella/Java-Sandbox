package src;

public class Controller {

    GameBoard gameBoard = new GameBoard();
    Player player1 = new Player();
    Player player2 = new Player();

    /** receives players' names and sets them to the player objects */
    public void setupPlayers(String player1Name, String player2Name) {

        player1.setName(player1Name);
        player1.setHeadsOrTails('O');
        player2.setName(player2Name);
        player1.setHeadsOrTails('X');

    }

    /** performs one turn of tictactoe */
    public void playTurn(Player player, int chosenSpace) {

        // play round only if game is not over
        if(gameBoard.getIsGameOver() == false) {
            //TODO: test whether this works
            int row = (chosenSpace / 3) - 1;
            int col = (chosenSpace % 3) - 1;

            // sets chosen space with player's character ('O' or 'X')
            gameBoard.setSpace(row, col, player.getHeadsOrTails());
        }
        // TODO: call and create method that checks when game is over

    }

    /** checks if one of the players has won the game
     * returns 0 if game is not over, 1 if player1 win, 2 if player2 win */
    public int checkGameOver() {

        char[][] spaces = gameBoard.getSpaces();
        char p1 = player1.getHeadsOrTails();
        char p2 = player2.getHeadsOrTails();

        // A: check all possible combinations
        if (
            // horizontal checks
            spaces[0][0] == p1 && spaces[0][1] == p1 && spaces[0][2] == p1
        ||  spaces[1][0] == p1 && spaces[1][1] == p1 && spaces[1][2] == p1
        ||  spaces[2][0] == p1 && spaces[2][1] == p1 && spaces[2][2] == p1
            // vertical checks
        ||  spaces[0][0] == p1 && spaces[1][0] == p1 && spaces[2][0] == p1
        ||  spaces[0][1] == p1 && spaces[1][1] == p1 && spaces[2][1] == p1
        ||  spaces[0][2] == p1 && spaces[1][2] == p1 && spaces[2][2] == p1
            // diagonal checks
        ||  spaces[0][0] == p1 && spaces[1][1] == p1 && spaces[2][2] == p1
        ||  spaces[0][2] == p1 && spaces[1][1] == p1 && spaces[2][0] == p1)
        {
            return 1;
        }

        if (
            // horizontal checks
            spaces[0][0] == p2 && spaces[0][1] == p2 && spaces[0][2] == p2
        ||  spaces[1][0] == p2 && spaces[1][1] == p2 && spaces[1][2] == p2
        ||  spaces[2][0] == p2 && spaces[2][1] == p2 && spaces[2][2] == p2
            // vertical checks
        ||  spaces[0][0] == p2 && spaces[1][0] == p2 && spaces[2][0] == p2
        ||  spaces[0][1] == p2 && spaces[1][1] == p2 && spaces[2][1] == p2
        ||  spaces[0][2] == p2 && spaces[1][2] == p2 && spaces[2][2] == p2
            // diagonal checks
        ||  spaces[0][0] == p2 && spaces[1][1] == p2 && spaces[2][2] == p2
        ||  spaces[0][2] == p2 && spaces[1][1] == p2 && spaces[2][0] == p2)
        {
            return 2;
        }

        return 0;
    }

    // alternative 1
    // which player is sent through parameters
    // alternative 2
    // since player 1 always plays before player 2, just say it in the code

    /** prints out the current state of the gameboard */
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
