package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Test various aspects of board.
 *
 * @author Jeroen Roosen
 */
class BoardTest {
    private final Square square = new BasicSquare();

    // 4. Since the board is valid your test should pass.
    // (width x height: 1×1 is large enough..)
    @Test
    void testBoard() {
        Square[][] squareBoard = {
            {square},
            {square}
        };
        Board board = new Board(squareBoard);
        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }

    // 5. Create a second test case in which you construct a similar board,
    //    but with just one null square.
    @Test
    void testBoardWithNull() {
        Square[][] squareBoard = { // (2x2 board size with the last one null square)
            { square, square },
            { square, null }
        };
        Board board = new Board(squareBoard);
        assertThat(board.squareAt(0,0)).isEqualTo(square); //
    }

    // 4. Since the board is valid your test should pass.
    // (width x height: 1×1 is large enough..)
//    @Test
//    void testBoard() {
//        Square[][] squareBoard = {
//            { mock(Square.class) },
//            { mock(Square.class) }
//        };
//        Board board = new Board(squareBoard);
//        assertThat(board.invariant()).isEqualTo(true);
//    }

    // 5. Create a second test case in which you construct a similar board,
    //    but with just one null square.
//    @Test
//    void testBoardWithNull() {
//        Square[][] squareBoard = { // (2x2 board size with the last one null square)
//            { mock(Square.class), mock(Square.class) },
//            { mock(Square.class), null }
//        };
//        Board board = new Board(squareBoard);
//        assertThat(board.invariant()).isEqualTo(false);////xxxx
//    }

}

