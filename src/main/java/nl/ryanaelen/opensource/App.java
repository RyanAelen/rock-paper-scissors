package nl.ryanaelen.opensource;

import nl.ryanaelen.opensource.rock_paper_scissors.RockPaperScissors;
import nl.ryanaelen.opensource.rock_paper_scissors.inputs.UnknownInputException;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean exit = false;
            String[] player = new String[2];
            for (int i = 0; i < 2; i++) {
                player[i] = scanner.nextLine();
                if (player[i].equals("esc") || player[i].equals("")) {
                    exit = true;
                    scanner.close();
                    break;
                }
            }
            if (exit) {
                break;
            }
            try {
                System.out.println(new RockPaperScissors().rps(player[0], player[1]));
            } catch (UnknownInputException e) {
                e.printStackTrace();
            }
        }
    }
}
