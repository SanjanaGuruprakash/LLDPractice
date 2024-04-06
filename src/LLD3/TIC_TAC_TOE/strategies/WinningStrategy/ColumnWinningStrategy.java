package LLD3.TIC_TAC_TOE.strategies.WinningStrategy;

import LLD3.TIC_TAC_TOE.model.Board;
import LLD3.TIC_TAC_TOE.model.Move;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy{
    Map<Integer, Map<Character,Integer>> map = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int col= move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol();

        if(!map.containsKey(col)){
            map.put(col, new HashMap<>());
        }
        Map<Character, Integer> colMap = map.get(col);
        if(!colMap.containsKey(symbol)){
            colMap.put(symbol, 0);
        }
        colMap.put(symbol, 1+colMap.get(symbol));

        if(board.getDimension()==colMap.get(symbol)){
            System.out.println("You won via col " + col);
            return true;
        }

        return false;
    }

    @Override
    public void undo(Board board, Move lastMove) {
        int col = lastMove.getCell().getCol();
        char symbol= lastMove.getPlayer().getSymbol();

        Map<Character, Integer> undoMap = map.get(col);
        undoMap.put(symbol,undoMap.get(symbol)-1);
    }
}
