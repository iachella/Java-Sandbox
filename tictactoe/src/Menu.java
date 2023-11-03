package src;

public class Menu {

    static Controller controller = new Controller();

    public void mainMenu() {

        playerSetupMenu();
        playRoundMenu();

        }

    public void playerSetupMenu() {

        String player1Name = InputClass.readLine("Player 1 name (heads): ");
        String player2Name = InputClass.readLine("Player 2 name (tails): ");
        controller.setupPlayers(player1Name, player2Name);

        System.out.println("Great! Let's begin.");
    }

    public void playRoundMenu() {

        int chosenSpace;

        controller.visualizeGameBoard();
        chosenSpace = InputClass.readInt(controller.player1.getName() +
                ", choose a space by entering its number");
        controller.playRound(controller.player1, chosenSpace);
        controller.visualizeGameBoard();
        chosenSpace = InputClass.readInt(controller.player2.getName() +
                ", choose a space by entering its number");
        controller.playRound(controller.player2, chosenSpace);

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