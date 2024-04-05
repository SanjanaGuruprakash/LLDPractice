package LLD3.TIC_TAC_TOE;

import LLD3.TIC_TAC_TOE.controller.GameController;
import LLD3.TIC_TAC_TOE.designs.WinningStrategy.ColumnWinningStrategy;
import LLD3.TIC_TAC_TOE.designs.WinningStrategy.DiagonalWinningStrategy;
import LLD3.TIC_TAC_TOE.designs.WinningStrategy.RowWinningStrategy;
import LLD3.TIC_TAC_TOE.designs.WinningStrategy.WinningStrategy;
import LLD3.TIC_TAC_TOE.exception.DuplicateSymbolException;
import LLD3.TIC_TAC_TOE.exception.PlayerCountMismatchException;
import LLD3.TIC_TAC_TOE.exception.moreThanOneBotException;
import LLD3.TIC_TAC_TOE.model.*;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) throws moreThanOneBotException, DuplicateSymbolException, PlayerCountMismatchException {
        GameController gameController= new GameController();
        int dimension = 3;
        List<Player> players = new ArrayList<>();
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        players.add(new Player('X', "Sanjana",1, PlayerType.HUMAN));
        players.add(new Bot('O', "BOT", 1, PlayerType.BOT, BotDifficultyLevel.EASY));

        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        Game game=gameController.startGame(dimension,players,winningStrategies);
        gameController.printBoard(game);

    }
}
