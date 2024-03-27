package winningstrategies;

import TIC_TAC_TOE.Board;
import TIC_TAC_TOE.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);

}
