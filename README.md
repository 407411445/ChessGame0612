# Chess Game

This is a Java-based chess game that allows two players to play a classic game of chess. The project consists of various classes representing the chessboard, pieces, and the logic for moving pieces.

## Table of Contents
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Classes and Methods](#classes-and-methods)
- [Contribution](#contribution)
- [License](#license)
- [Contact](#contact)

## Features
- Fully functional chess game
- Validation for legal moves
- Text-based representation of the chessboard
- Easy-to-understand code structure

## Installation

1. **Clone the repository:**
    ```sh
    git clone https://github.com/yourusername/chess-game.git
    cd chess-game
    ```

2. **Compile the Java files:**
    ```sh
    javac -d bin src/BoardGame/*.java src/GameObject/*.java src/Models/*.java src/StaticEnums/*.java src/Main.java
    ```

3. **Run the game:**
    ```sh
    java -cp bin Main
    ```

## Usage

1. **Start the game:**
   When you run the game, the initial chessboard setup will be displayed in the console.

2. **Make Moves:**
   You can make moves by specifying the start and end coordinates. For example, to move a piece from b2 to b4, you can use:
   ```java
   player.makeMove(new Coordinates("b2"), new Coordinates("b4"));
