package SpringBootApp;

import BoardGame.Board;
import BoardGame.Coordinates;
import Models.Player;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!!!!!!!!!!!!!!!!!!!!!!!!!");

        Board board = new Board();
        Player player  = new Player();

        System.out.println(board.printBoard());

        player.makeMove(new Coordinates("b2"),new Coordinates("b4"));
        System.out.println(board.printBoard());
        player.makeMove(new Coordinates("b4"),new Coordinates("b5"));
        System.out.println(board.printBoard());
        player.makeMove(new Coordinates("a7"),new Coordinates("a6"));
        System.out.println(board.printBoard());
        player.makeMove(new Coordinates("b5"),new Coordinates("a6"));
        System.out.println(board.printBoard());
    }
}