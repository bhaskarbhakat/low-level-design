package com.snakeandladder.models;
import java.util.*;

import lombok.Getter;;

@Getter
public class Cell {
    private int Position;
    private List<Piece> PlayerPieces;
    private List<Obstacle> Obstacles;

}
