package LLD3.TIC_TAC_TOE.designs.BotStrategy;

import LLD3.TIC_TAC_TOE.model.BotDifficultyLevel;

public class BotPlayingStrategyFactory {


    public static BotPlayingStrategy getBotStartegyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        return switch (botDifficultyLevel) {
            case EASY -> new EasyPlayingStrategy();
            case MEDIUM -> new MediumPlayingStrategy();
            case HARD -> new DifficultPlayingStrategy();
        };
    }
}
