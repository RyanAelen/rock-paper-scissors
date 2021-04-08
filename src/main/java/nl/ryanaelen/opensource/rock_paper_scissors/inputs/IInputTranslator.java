package nl.ryanaelen.opensource.rock_paper_scissors.inputs;

public interface IInputTranslator {
    IInput get(String input) throws UnknownInputException;
}
