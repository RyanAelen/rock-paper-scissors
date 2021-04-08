package nl.ryanaelen.opensource.rock_paper_scissors.inputs;

public class InputTranslatorString implements IInputTranslator {

    @Override
    public IInput get(String input) throws UnknownInputException {
        IInput result;
        if (input == null) throw new UnknownInputException();
        switch (input) {
            case "rock" -> result = new Rock();
            case "paper" -> result = new Paper();
            case "scissors" -> result = new Scissors();
            default -> throw new UnknownInputException();
        }
        return result;
    }
}
