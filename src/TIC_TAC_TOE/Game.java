package TIC_TAC_TOE;

import TIC_TAC_TOE.Board;
import exceptions.DuplicateSymbolException;
import exceptions.MoreThanOneBotException;
import exceptions.PlayerCountMismatchException;
import winningstrategies.WinningStrategy;

import java.util.*;
public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> move;
    private Player winningPlayer;
    private GameStatus state;
    private int nextPlayerIndex;
    private List<WinningStrategy> winingStrategy;

    public Game(int size, List<Player> players, List<WinningStrategy> winingStrategy) {
        this.board=new Board(size);
        this.players = players;
        this.winingStrategy = winingStrategy;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public void printBoard(){
        board.printBoard();
    }
    public static class Builder{
        private int size;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private Builder(){
            this.size=0;
            this.players=new ArrayList<>();
            this.winningStrategies=new ArrayList<>();
            
        }
        public Game build() throws MoreThanOneBotException, DuplicateSymbolException, PlayerCountMismatchException {
            validateBotCount();
            validateUniqueSymbolForPlayer();
            validateDimensionAndPlayerCount();
            return new Game(size, players,winningStrategies);


        }

        private void validateDimensionAndPlayerCount() throws PlayerCountMismatchException {
            if(players.size()!=(size-1))
                throw new PlayerCountMismatchException();

        }

        private void validateUniqueSymbolForPlayer() throws DuplicateSymbolException {
            Set<Character> symbolSet=new HashSet<>();
            for(Player p:players){
                if(symbolSet.contains(p.getSymbol())){
                    throw new DuplicateSymbolException();
                }
                else
                    symbolSet.add(p.getSymbol());
            }
        }

        private void validateBotCount() throws MoreThanOneBotException {
            int botCount=0;
            for(Player p:players){
                if(p.getType().equals(PlayerType.BOT))
                    botCount++;
            }
            if(botCount>1){
                throw new MoreThanOneBotException();
            }


        }

        public Builder setSize(int size) {
            this.size = size;
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
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMove() {
        return move;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setMove(List<Move> move) {
        this.move = move;
    }

    public Player getWinningPlayer() {
        return winningPlayer;
    }

    public void setWinningPlayer(Player winningPlayer) {
        this.winningPlayer = winningPlayer;
    }

    public GameStatus getState() {
        return state;
    }

    public void setState(GameStatus state) {
        this.state = state;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }
}
