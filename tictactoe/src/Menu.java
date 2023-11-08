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
        int gameStatus;

        // TODO: player 2 can still play one turn even though they lost
        do {
            controller.visualizeGameBoard();
            chosenSpace = InputClass.readInt(controller.player1.getName() +
                    ", choose a space by entering its number: ");
            controller.playTurn(controller.player1, chosenSpace);
            gameStatus = controller.checkGameOver();
            controller.visualizeGameBoard();
            chosenSpace = InputClass.readInt(controller.player2.getName() +
                    ", choose a space by entering its number: ");
            controller.playTurn(controller.player2, chosenSpace);
            gameStatus = controller.checkGameOver();
        } while (gameStatus == 4);

        switch (gameStatus) {
            case 1: System.out.println(controller.player1.getName() + "wins"); break;
            case 2: System.out.println(controller.player2.getName() + "wins"); break;
            case 3: System.out.println("nobody wins"); break;
        }

    }

}