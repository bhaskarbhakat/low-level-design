# Design a TicTacToe

### Gather Requirements
```
- Board can be of nxn dimensions.
- A game will have human and bot player.
- Bot will have difficult level of easy, medium and hard.
- Each player will have different symbol.
- Game will have n-1 player.
- Randomly select a player to start a game.
- Board will consists of cells.
- Any player can do undo.
- Game can have multiple winning strategy.
```



---
### Clarifying Requirements
```

```



---
### Class Diagram
```mermaid
classDiagram

    class Board{
        - List< List< Cell>> Cells
    }

    class Cell{
        - int x
        - int y
        - Player player
    }

    class Player{
        - string name
        - char symbol
        - PlayerType type
    }

    class Bot{

    }

    class Human{

    }

```



---
### Schema Design
```

```



---
### Code
```

```