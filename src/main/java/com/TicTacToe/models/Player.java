package com.TicTacToe.models;

import java.util.List;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private char symbol;
    private PlayerType playerType;
    private List<Move> moves;
    
    public Player(String name, char symbol, PlayerType playerType, List<Move> moves){
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        this.moves = moves;
    }

    public Move decideMove(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row and col to perform next move");
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        return new Move(this, new Cell(row, col));
        
    }
}
