package LLD3.TIC_TAC_TOE.designs.BotStrategy;

import LLD3.TIC_TAC_TOE.model.Board;
import LLD3.TIC_TAC_TOE.model.Cell;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);

}
