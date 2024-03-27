package botstrategies;

import TIC_TAC_TOE.Board;
import TIC_TAC_TOE.Cell;

public interface BotPlayingStrategy {
    Cell checkMove(Board board);
}
