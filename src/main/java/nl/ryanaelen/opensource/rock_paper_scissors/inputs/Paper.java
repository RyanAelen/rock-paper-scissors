package nl.ryanaelen.opensource.rock_paper_scissors.inputs;

public class Paper implements IInput {
    @Override
    public boolean winFrom(IInput input) {
        return input instanceof Rock;
    }
}
