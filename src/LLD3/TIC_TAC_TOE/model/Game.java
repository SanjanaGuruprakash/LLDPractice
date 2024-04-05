package LLD3.TIC_TAC_TOE.model;

import LLD3.TIC_TAC_TOE.designs.WinningStrategy.WinningStrategy;
import LLD3.TIC_TAC_TOE.exception.DuplicateSymbolException;
import LLD3.TIC_TAC_TOE.exception.PlayerCountMismatchException;
import LLD3.TIC_TAC_TOE.exception.moreThanOneBotException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winningPlayer;
    private int nextPlayerIndex;
    private GameState gameState;

    private List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;

    }
    public void printBoard() {
        board.printBoard();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder() {
            dimension=0;
            winningStrategies=new ArrayList<>();
            players=new ArrayList<>();
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }


        public Game build() throws PlayerCountMismatchException, DuplicateSymbolException, moreThanOneBotException {
            validateDimensionAndPlayerCount();
            validateDuplicateSymbol();
            validateBotCount();

            return new Game(dimension,players,winningStrategies);
        }

        private void validateBotCount() throws moreThanOneBotException {
            int botCount=0;
            for(Player player:players){
                if(player.getPlayerType()==PlayerType.BOT){
                    botCount++;
                }
            }
            if(botCount>1){
                throw new moreThanOneBotException();
            }
        }

        private void validateDuplicateSymbol() throws DuplicateSymbolException {
            HashSet<Character> symbolSet = new HashSet<>();
            for(Player player:players){
                if(symbolSet.contains(player.getSymbol())){
                    throw new DuplicateSymbolException();
                }
                else{
                    symbolSet.add(player.getSymbol());
                }
            }

        }

        private void validateDimensionAndPlayerCount() throws PlayerCountMismatchException{
            if(players.size()!=(dimension-1)){
                throw new PlayerCountMismatchException();
            }
        }

        public int getDimension() {
            return dimension;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }


    }
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinningPlayer() {
        return winningPlayer;
    }

    public void setWinningPlayer(Player winningPlayer) {
        this.winningPlayer = winningPlayer;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
