package winningstrategies;

import TIC_TAC_TOE.Board;
import TIC_TAC_TOE.Move;

public class RowWinningStartegy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
