package botstrategies;

import TIC_TAC_TOE.DifficultyLevel;
public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPalyingStartegyForDifficultyLevel(DifficultyLevel level) {
        return switch (level) {
            case EASY -> new EasyPlayingStrategy();
            case MEDIUM -> new MediumPlayingStrategy();
            case HARD -> new DifficultPlayingStrategy();
        };
    }
}
