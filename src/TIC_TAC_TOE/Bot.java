package TIC_TAC_TOE;

import botstrategies.BotPlayingStrategy;
import botstrategies.BotPlayingStrategyFactory;


public class Bot extends Player {
    private DifficultyLevel level;
    private BotPlayingStrategy botPlayingStrategy;
    public Bot(char symbol, String name, int id, PlayerType type, DifficultyLevel level) {
        super(symbol, name, id, type);
        this.level=level;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPalyingStartegyForDifficultyLevel(level);
    }

    public DifficultyLevel getLevel() {
        return level;
    }

    public void setLevel(DifficultyLevel level) {
        this.level = level;
    }
}
