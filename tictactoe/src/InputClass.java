package src;
import java.util.Scanner;

public class InputClass {

    private static final String EOL = System.lineSeparator();
    static Scanner scanner = new Scanner(System.in);

    public static String readLine(String string){
        System.out.print(string);
        String input = scanner.nextLine();
        return input;
    }

    public static int readInt(String string){
        System.out.print(string);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static double readDouble(String string){
        System.out.print(string);
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }


    public static void closeScanner() {
        scanner.close();
    }
}
