package LLD3.TIC_TAC_TOE.controller;

import LLD3.TIC_TAC_TOE.strategies.WinningStrategy.WinningStrategy;
import LLD3.TIC_TAC_TOE.exception.DuplicateSymbolException;
import LLD3.TIC_TAC_TOE.exception.PlayerCountMismatchException;
import LLD3.TIC_TAC_TOE.exception.moreThanOneBotException;
import LLD3.TIC_TAC_TOE.model.Game;
import LLD3.TIC_TAC_TOE.model.Player;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws moreThanOneBotException, DuplicateSymbolException, PlayerCountMismatchException {
        return Game.getBuilder().setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }
    public void printBoard(Game game){

        game.printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();

    }

    public void undo(Game game) {
        game.undo();
    }
}
