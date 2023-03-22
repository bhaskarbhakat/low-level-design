# Design a TicTacToe

### Gather Requirements
```
- Board can be of nxn size.
- Game will have n-1 players.
- Every player can choose their symbol as any char at the start of the game.
- Each player will have different symbol.
- At the start of game we randomize the list of players and play in that order.
- A game will have human and bot player.
- Bot will have difficult level of easy, medium and hard.
- Board will consists of cells.
- Any player can make a undo move.
- A Game will have game status like in progress, finished, draw.
- Game can have multiple winning algorithm.
- A Game will stop once we got first winner or game is drawn.
```



---
### Clarifying Requirements
```
Ex: How will game start?
    How many undo moves a player can make?
```



---
### Class Diagram
```mermaid
classDiagram

    Game -- Board
    Game -- Move
    Game -- GameStatus
    Game -- Player
    Game -- GameWinningStrategy

    class Game{
        - Board board
        - List< Move> moves
        - List< Player> players
        - GameStatus gameStatus
        - nextPlayerIndex
    }

    Move -- Player
    Move -- Cell

    class Move{
        - Player player
        - Cell cell
    }

    class GameStatus{
        <<enumeration>>
        IN_PROGRESS
        DRAW
        ENDED
    }
    
    Board -- Cell
    class Board{
        - List< List< Cell>> Cells
    }

    Cell -- CellStatus
    Cell -- Player

    class Cell{
        - int x
        - int y
        - Player player
        - CellStatus cellStatus
    }

    class CellStatus{
        <<enumeration>>
        EMPTY
        FILLED
        BLOCKED
    }

    Player -- PlayerType
    Player <|-- Bot
    class Player{
        - string name
        - char symbol
        - PlayerType type
    }

    class PlayerType{
        <<enumeration>>
        HUMAN
        BOT
    }

    Bot -- DifficultyLevel
    Bot -- BotPlayingStrategy

    class Bot{
        - DifficultyLevel level
    }

    class DifficultyLevel{
        <<enumeration>>
        EASY
        MEDIUM
        HARD
    }

    class GameWinningStrategy{
        <<interface>>
    }

    class RowWinningStrategy{

    }
    class ColumnWinningStrategy{

    }
    class DiagonalWinningStrategy{

    }

    class BotPlayingStrategy{
        <<interface>>
    }

    class EasyBotPlayingStrategy{   
    }

    class MediumBotPlayingStrategy{   
    }

    class HardBotPlayingStrategy{   
    }

    BotPlayingStrategy <|.. EasyBotPlayingStrategy
    BotPlayingStrategy <|.. MediumBotPlayingStrategy
    BotPlayingStrategy <|.. HardBotPlayingStrategy

    GameWinningStrategy <|.. RowWinningStrategy
    GameWinningStrategy <|.. ColumnWinningStrategy
    GameWinningStrategy <|.. DiagonalWinningStrategy
```



---
### Schema Design
```
Not needed in this.
```



---
### Code
```

```