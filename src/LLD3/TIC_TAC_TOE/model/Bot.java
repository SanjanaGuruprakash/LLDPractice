package LLD3.TIC_TAC_TOE.model;


import LLD3.TIC_TAC_TOE.strategies.BotStrategy.BotPlayingStrategy;
import LLD3.TIC_TAC_TOE.strategies.BotStrategy.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(char symbol, String name, int id, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, id, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy= BotPlayingStrategyFactory.getBotStartegyForDifficultyLevel(botDifficultyLevel);
    }

    @Override
    public Cell makeMove(Board board){
        System.out.println("Get ready for bot's move");
        Cell cell = botPlayingStrategy.makeMove(board);

        cell.setCellState(CellState.FILLED);
        cell.setPlayer(this);

        return cell;
    }
}
