package controller;

import TIC_TAC_TOE.Game;
import TIC_TAC_TOE.Player;
import exceptions.DuplicateSymbolException;
import exceptions.MoreThanOneBotException;
import exceptions.PlayerCountMismatchException;
import winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int size, List<Player> players, List<WinningStrategy> strategies) throws DuplicateSymbolException, PlayerCountMismatchException, MoreThanOneBotException {
        return Game.getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategies(strategies)
                .build();
    }
    public void printBoard(Game game){
        game.printBoard();
    }
}
