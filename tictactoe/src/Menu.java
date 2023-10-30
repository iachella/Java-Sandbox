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

}