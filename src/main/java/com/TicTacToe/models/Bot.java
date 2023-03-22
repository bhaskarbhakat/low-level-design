package com.TicTacToe.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bot extends Player{
    private DifficultyLevel botDifficultylevel;

    public Bot(String name, char symbol, DifficultyLevel botDifficultylevel, List<Move> moves){
        super(name, symbol, PlayerType.BOT, moves);
        this.botDifficultylevel = botDifficultylevel;
    }
}
