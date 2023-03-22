package com.TicTacToe.controllers;

import java.util.List;

import com.TicTacToe.models.Game;
import com.TicTacToe.models.GameStatus;
import com.TicTacToe.models.Player;

public class GameController {

    public Game createGame(int dimension, List<Player> players){
        try{
            return Game.getBuilder()
                       .setPlayers(players)
                       .setDimension(dimension)
                       .build();
        }
        catch (Exception e){
            return null;
        }
    }
    
    public void displayBoard(Game game){
        game.displayBoard();
    }

    public void executeNextMove(Game game){
        game.makeNextMove(game);
    }

    public void undo(Game game){
        game.undo(game);
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus(game);
    }

}
