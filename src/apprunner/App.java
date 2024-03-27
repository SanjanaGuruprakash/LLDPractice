package apprunner;

import TIC_TAC_TOE.*;

import controller.GameController;
import exceptions.DuplicateSymbolException;
import exceptions.MoreThanOneBotException;
import exceptions.PlayerCountMismatchException;
import winningstrategies.ColumnWinningStrategy;
import winningstrategies.RowWinningStartegy;
import winningstrategies.WinningStrategy;
import winningstrategies.diagonalWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws DuplicateSymbolException, PlayerCountMismatchException, MoreThanOneBotException {
        GameController gameController= new GameController();

        int size = 3;
        List<Player> playerList=new ArrayList<>();
        List<WinningStrategy> winningStrategiesList=new ArrayList<>();

        playerList.add(new Player('X',"Sanjana", 1, PlayerType.HUMAN));
        playerList.add(new Bot('O', "GPT", 2, PlayerType.BOT, DifficultyLevel.EASY));

        winningStrategiesList.add(new RowWinningStartegy());
        winningStrategiesList.add(new ColumnWinningStrategy());
        winningStrategiesList.add(new diagonalWinningStrategy());

        Game game=gameController.startGame(3,playerList,winningStrategiesList);
        game.printBoard();
    }
}
