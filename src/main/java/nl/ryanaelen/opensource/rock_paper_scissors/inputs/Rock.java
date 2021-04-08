package nl.ryanaelen.opensource.rock_paper_scissors.inputs;

public class Rock implements IInput {
    @Override
    public boolean winFrom(IInput input) {
        return input instanceof Scissors;
    }
}
