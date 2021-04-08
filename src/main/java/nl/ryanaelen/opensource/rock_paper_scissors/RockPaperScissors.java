package nl.ryanaelen.opensource.rock_paper_scissors;

import nl.ryanaelen.opensource.rock_paper_scissors.inputs.IInput;
import nl.ryanaelen.opensource.rock_paper_scissors.inputs.IInputTranslator;
import nl.ryanaelen.opensource.rock_paper_scissors.inputs.InputTranslatorString;
import nl.ryanaelen.opensource.rock_paper_scissors.inputs.UnknownInputException;

public class RockPaperScissors {
    private final IInputTranslator inputTranslator;

    public RockPaperScissors() {
        inputTranslator = new InputTranslatorString();
    }

    public String rps(String player1, String player2) throws UnknownInputException {
        if (playerWintVan(player1, player2)) {
            return "player 1 wins";
        } else if (playerWintVan(player2, player1)) {
            return "player 2 wins";
        } else {
            return "TIE";
        }
    }

    private boolean playerWintVan(String player1, String player2) throws UnknownInputException {
        return playerWintVan(getInputType(player1), getInputType(player2));
    }

    private boolean playerWintVan(IInput player1, IInput player2) {
        return player1.winFrom(player2);
    }

    private IInput getInputType(String input) throws UnknownInputException {
        return inputTranslator.get(input);
    }

}
