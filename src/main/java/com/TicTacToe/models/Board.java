package com.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private List<List<Cell>> board;
    
    public Board(int dimension){
        this.board = new ArrayList<>();
        for(int i=0;i<dimension;i++){
            List<Cell> cuList = new ArrayList<>();
            for (int j = 0; j < dimension; j++) {
                cuList.add(new Cell(i,j));
            }
            this.board.add(cuList);
        }
    }

    public void display(){
        System.out.println(board.size());
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                if(board.get(i).get(j).getCellStatus().equals(CellStatus.EMPTY)){
                    System.out.print("|   |");
                }
                else{
                    System.out.print("| " + board.get(i).get(j).getPlayer().getSymbol() + " |");
                }
            }
            System.out.println("\n");
            
        }
    }
}
