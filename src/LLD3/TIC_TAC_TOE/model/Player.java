package LLD3.TIC_TAC_TOE.model;

import java.util.Scanner;

public class Player {
    private char symbol;
    private String name;
    private int Id;
    private PlayerType playerType;
    private Scanner scanner =  new Scanner(System.in);

    public Player(char symbol, String name, int id, PlayerType playerType) {
        this.symbol = symbol;
        this.name = name;
        this.Id = id;
        this.playerType = playerType;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Cell makeMove(Board board) {
        System.out.println(this.name +" It's your turn, enter the row and col");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        while(!validateMove(row, col, board)){
            System.out.println("Invalid input, please try again");
            row = scanner.nextInt();
            col = scanner.nextInt();

        }
        Cell cell = board.getBoard().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(this);

        return cell;


    }

    private boolean validateMove(int row, int col, Board board) {
        if(row>=board.getDimension() || row<0){
            return false;
        }
        if(col>=board.getDimension() || col<0){
            return false;
        }
        if(CellState.FILLED.equals(board.getBoard().get(row).get(col).getCellState())){
            return false;
        }

        return true;

    }
}
