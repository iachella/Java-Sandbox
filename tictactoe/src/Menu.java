package src;

public class Menu {

    static Controller controller = new Controller();

    public void mainMenu() {

        //enterPlayerNames();
        controller.playGame();

        }

    public void enterPlayerNames() {

        String player1Name = InputClass.readLine("Player 1 name: ");
        String player2Name = InputClass.readLine("Player 2 name: ");

    }

    // do
        // read input from player 1
        // update and visualize gameBoard
        // read input from player 2
        // update and visualize gameBoard
        // repeat until win or draw
    // while gameBoard.isGameOver == false

    // checkGameOver
    // if 3 in row or no more spaces available (draw)
    // more advanced could detect draw before board is full

}