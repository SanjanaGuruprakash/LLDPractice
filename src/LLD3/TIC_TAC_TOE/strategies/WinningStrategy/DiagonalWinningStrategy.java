package LLD3.TIC_TAC_TOE.strategies.WinningStrategy;

import LLD3.TIC_TAC_TOE.model.Board;
import LLD3.TIC_TAC_TOE.model.Move;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{
    Map<Character, Integer> rightDia = new HashMap<>();
    Map<Character, Integer> leftDia = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol();

        if(row==col){
            if(!leftDia.containsKey(symbol)){
                leftDia.put(symbol,0);
            }
            leftDia.put(symbol,1+leftDia.get(symbol));

            if(board.getDimension() == leftDia.get(symbol)) {
                System.out.println("You won via left Diagonal");
                return true;
            }
        }
        if((row+col)==(board.getDimension()-1)){
            if(!rightDia.containsKey(symbol)){
                rightDia.put(symbol,0);
            }
            rightDia.put(symbol,1+rightDia.get(symbol));

            if(board.getDimension() == rightDia.get(symbol)){
                System.out.println("You won via right Diagonal");
                return true;
            }
        }
        return false;
    }
}
