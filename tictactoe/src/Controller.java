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
        player2.setHeadsOrTails('X');

    }

    /** performs one turn of tictactoe */
    public void playTurn(Player player, int chosenSpace) {

        int row = -1, col = -1;
        // play round only if game is not over
        if(gameBoard.getIsGameOver() == false) {
            // TODO: test whether this works
            // TODO: game exits with draw on first round
            // TODO: fix smelly code
            switch (chosenSpace){
                case 1,2,3: row = 0;
                case 4,5,6: row = 1;
                case 7,8,9: row = 2;
            }
            switch (chosenSpace){
                case 1,4,7: col = 0;
                case 2,5,8: col = 1;
                case 3,6,9: col = 2;
            }

            // set space only if still available
            if (gameBoard.getSpaces()[row][col] == '#'){
                // sets chosen space with player's character ('O' or 'X')
                gameBoard.setSpace(row, col, player.getHeadsOrTails());
            }

        }
    }

    /** checks if one of the players has won the game
     * return values:
     * 1 if player1 wins
     * 2 if player2 wins
     * 3 if game ends with draw
     * 4 if game continues */
    public int checkGameOver() {


        char[][] spaces = gameBoard.getSpaces();
        char p1 = player1.getHeadsOrTails();
        char p2 = player2.getHeadsOrTails();

        // Scenario 1: Player 1 wins - check all possible combinations
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
            // player 1 wins
            gameBoard.setIsGameOver(true);
            return 1;
        }

        // Scenario 2: Player 2 wins - check all possible combinations
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
            // player 2 wins
            gameBoard.setIsGameOver(true);
            return 2;
        }

        // Scenario 3: Game ends with a draw
        // initialize isDraw as true and set it false as long as there are playable spaces
        boolean isDraw = true;
        // iterate through spaces
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                // if space is still playable (contains '#') game can continue
                if (spaces[row][col] == '#'){
                    isDraw = false;
                }
            }
        }

        if (isDraw) {
            // game is a draw
            gameBoard.setIsGameOver(true);
            return 3;
        } else {
            // game is not over
            return 4;
        }
    }

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
