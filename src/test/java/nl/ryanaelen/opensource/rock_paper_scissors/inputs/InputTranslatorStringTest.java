package nl.ryanaelen.opensource.rock_paper_scissors.inputs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputTranslatorStringTest {
    IInputTranslator sut;

    @BeforeEach
    void setUp() {
        sut = new InputTranslatorString();
    }

    @Test
    void get() throws UnknownInputException {
        // arrange
        // act
        var resultR = sut.get("rock");
        var resultP = sut.get("paper");
        var resultC = sut.get("scissors");
        // assert
        assertTrue(resultR instanceof Rock);
        assertTrue(resultP instanceof Paper);
        assertTrue(resultC instanceof Scissors);
    }

    @Test
    void exception() {
        // arrange
        // act
        // assert
        assertThrows(UnknownInputException.class, () -> sut.get(""));
        assertThrows(UnknownInputException.class, () -> sut.get(null));
        assertThrows(UnknownInputException.class, () -> sut.get("randomString"));
    }
}