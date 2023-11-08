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

        do {
            gameStatus = controller.checkGameOver();
            controller.visualizeGameBoard();
            chosenSpace = InputClass.readInt(controller.player1.getName() +
                    ", choose a space by entering its number: ");
            controller.playTurn(controller.player1, chosenSpace);
            controller.visualizeGameBoard();
            chosenSpace = InputClass.readInt(controller.player2.getName() +
                    ", choose a space by entering its number: ");
            controller.playTurn(controller.player2, chosenSpace);
        } while (gameStatus == 4);

        switch (gameStatus) {
            case 1: System.out.println(controller.player1.getName() + "wins");
            case 2: System.out.println(controller.player2.getName() + "wins");
            case 3: System.out.println("nobody wins");
        }

    }

}