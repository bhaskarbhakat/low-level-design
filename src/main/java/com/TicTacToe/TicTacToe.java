package com.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.TicTacToe.controllers.GameController;
import com.TicTacToe.models.Bot;
import com.TicTacToe.models.DifficultyLevel;
import com.TicTacToe.models.Game;
import com.TicTacToe.models.GameStatus;
import com.TicTacToe.models.Player;
import com.TicTacToe.models.PlayerType;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();

        System.out.println("Enter the dimension of board");

        // Set dimension
        int dimension = sc.nextInt();

        List<Player> player = new ArrayList<>();
        
        System.out.println("Do you have a bot? y/n");
        String isBot = sc.next();

        int toIterate = dimension - 1;

        if(isBot.equals("y")){

            System.out.println("What is the name of player");
            String name = sc.next();

            System.out.println("What is the symbol of player");
            String symbol = sc.next();
            
            player.add(new Bot(name, symbol.charAt(0), DifficultyLevel.EASY, null));

            toIterate = dimension - 2;
        }

        for (int i = 0; i < toIterate; i++) {
            System.out.println("What is the name of player " + i);
            String name = sc.next();

            System.out.println("What is the symbol of player " + i);
            String symbol = sc.next();
            
            player.add(new Player(name, symbol.charAt(0), PlayerType.HUMAN, null));
        }

        Game game = gameController.createGame(dimension, player);

        while(!gameController.getGameStatus(game).equals(GameStatus.DRAW)){
            System.out.println("This is the current board: ");

            gameController.displayBoard(game);

            System.out.println("Does anyone wants to undo? y/n");
            String input = sc.next();

            if(input.equals("y")){
                // undo
                gameController.displayBoard(game);
            }
            else {
                System.out.println("This is player " + game.getNextPlayerIndex() + " move: " + 
                "Enter cell coordinates row and column to make next move");

                // Take row and column as a input
                gameController.executeNextMove(game);
                gameController.displayBoard(game);

            }

        }

        System.out.println("Game has been ended. Result was " + game.getGameStatus());

        if(!game.getGameStatus().equals(GameStatus.DRAW)){
            // System.out.println("Winner is " + game.getWinner());
        }

        

        // List<Player> players = null;

    }
}
