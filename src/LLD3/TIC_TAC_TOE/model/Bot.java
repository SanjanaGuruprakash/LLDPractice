package LLD3.TIC_TAC_TOE.model;


import LLD3.TIC_TAC_TOE.designs.BotStrategy.BotPlayingStrategy;
import LLD3.TIC_TAC_TOE.designs.BotStrategy.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(char symbol, String name, int id, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, id, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy= BotPlayingStrategyFactory.getBotStartegyForDifficultyLevel(botDifficultyLevel);
    }
}
