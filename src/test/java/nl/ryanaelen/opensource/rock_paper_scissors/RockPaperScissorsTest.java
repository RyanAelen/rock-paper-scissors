package nl.ryanaelen.opensource.rock_paper_scissors;

import nl.ryanaelen.opensource.rock_paper_scissors.inputs.UnknownInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {

    RockPaperScissors sut;

    @BeforeEach
    void setUp() {
        sut = new RockPaperScissors();
    }

    @Test
    void paperWinsPlayer1() throws UnknownInputException {
        // arrange
        // act
        var result = sut.rps("paper", "rock");
        // assert
        assertEquals("player 1 wins", result);
    }

    @Test
    void rockWinsPlayer1() throws UnknownInputException {
        // arrange
        // act
        var result = sut.rps("rock", "scissors");
        // assert
        assertEquals("player 1 wins", result);
    }

    @Test
    void scissorsWinsPlayer1() throws UnknownInputException {
        // arrange
        // act
        var result = sut.rps("scissors", "paper");
        // assert
        assertEquals("player 1 wins", result);
    }

    @Test
    void paperWinsPlayer2() throws UnknownInputException {
        // arrange
        // act
        var result = sut.rps("rock", "paper");
        // assert
        assertEquals("player 2 wins", result);
    }

    @Test
    void rockWinsPlayer2() throws UnknownInputException {
        // arrange
        // act
        var result = sut.rps("scissors", "rock");
        // assert
        assertEquals("player 2 wins", result);
    }

    @Test
    void scissorsWinsPlayer2() throws UnknownInputException {
        // arrange
        // act
        var result = sut.rps("paper", "scissors");
        // assert
        assertEquals("player 2 wins", result);
    }

    @Test
    void tiePaper() throws UnknownInputException {
        // arrange
        // act
        var result = sut.rps("paper", "paper");
        // assert
        assertEquals("TIE", result);
    }

    @Test
    void tieRock() throws UnknownInputException {
        // arrange
        // act
        var result = sut.rps("rock", "rock");
        // assert
        assertEquals("TIE", result);
    }

    @Test
    void tieScissors() throws UnknownInputException {
        // arrange
        // act
        var result = sut.rps("scissors", "scissors");
        // assert
        assertEquals("TIE", result);
    }

}