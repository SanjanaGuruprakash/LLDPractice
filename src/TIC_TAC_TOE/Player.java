package TIC_TAC_TOE;

import java.util.*;
public class Player {
    private char symbol;
    private  String name;
    private  int id;
    private PlayerType type;


    public Player(char symbol, String name, int id, PlayerType type) {
        this.symbol = symbol;
        this.name = name;
        this.id = id;
        this.type = type;
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
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }
}
