package LLD3.TIC_TAC_TOE.strategies.WinningStrategy;

import LLD3.TIC_TAC_TOE.model.Board;
import LLD3.TIC_TAC_TOE.model.Move;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{
    Map<Integer, Map<Character,Integer>> map = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row= move.getCell().getRow();
        char symbol = move.getPlayer().getSymbol();

        if(!map.containsKey(row)){
            map.put(row, new HashMap<>());
        }
        Map<Character, Integer> rowMap = map.get(row);
        if(!rowMap.containsKey(symbol)){
            rowMap.put(symbol, 0);
        }
        rowMap.put(symbol, 1+rowMap.get(symbol));

        if(board.getDimension()==rowMap.get(symbol)){
            System.out.println("You won via row " + row);
            return true;
        }

        return false;
    }

    @Override
    public void undo(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        char symbol= lastMove.getPlayer().getSymbol();

        Map<Character, Integer> undoMap = map.get(row);
        undoMap.put(symbol,undoMap.get(symbol)-1);
    }
}
