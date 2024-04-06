package LLD3.TIC_TAC_TOE.strategies.BotStrategy;

import LLD3.TIC_TAC_TOE.model.Board;
import LLD3.TIC_TAC_TOE.model.Cell;
import LLD3.TIC_TAC_TOE.model.CellState;

import java.util.List;

public class EasyPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Cell makeMove(Board board) {
        for(List<Cell> row: board.getBoard()){
            for (Cell cell: row){
                if(CellState.EMPTY.equals(cell.getCellState())){
                    return cell;
                }
            }
        }
        return null;
    }
}
