package com.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

import com.TicTacToe.exceptions.InvalidGameConstructionParameterException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    private Board board;
    private List<Move> moves;
    private List<Player> players;
    private GameStatus gameStatus;
    int nextPlayerIndex;

    private Game(){}

    public void displayBoard(){
        this.board.display();
    }

    public void makeNextMove(Game game){
        Player toMovePlayer = players.get(nextPlayerIndex);

        Move move = toMovePlayer.decideMove(this.board);

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        System.out.println("Move to row: " + row + " col: " + col);

        Move finalMove = new Move(toMovePlayer, new Cell(row, col));
        moves.add(finalMove);

        this.board.getBoard().get(row).get(col).setCellStatus(CellStatus.FILLED);
        this.board.getBoard().get(row).get(col).setPlayer(toMovePlayer);

        setNextPlayerIndex((nextPlayerIndex+1)%players.size());
    }

    public void undo(Game game){

    }

    public GameStatus getGameStatus(Game game){
        return this.gameStatus;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private boolean validate() throws InvalidGameConstructionParameterException{
            if(this.dimension<=2){
                throw new InvalidGameConstructionParameterException("Dimension can't be less than 2");
            }

            // Validate all player must have unique symbol

            // Validate game can have atmost one bot
            return true;
        }

        public Game build() throws InvalidGameConstructionParameterException{
            try{
                validate();
            }
            catch (Exception e){
                throw new InvalidGameConstructionParameterException(e.getMessage());
            }

            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setBoard(new Board(dimension));
            game.setNextPlayerIndex(0);
            return game;
        }

    }

}
