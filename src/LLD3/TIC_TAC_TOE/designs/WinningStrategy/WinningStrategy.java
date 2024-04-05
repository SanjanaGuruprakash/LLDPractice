package LLD3.TIC_TAC_TOE.designs.WinningStrategy;

import LLD3.TIC_TAC_TOE.model.Board;
import LLD3.TIC_TAC_TOE.model.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
