package Models;

import BoardGame.Board;
import BoardGame.Coordinates;
import GameObject.Pawn;
import StaticEnums.PieceType;

import java.util.Arrays;

public class Player {

    String name;

    public void makeMove(Coordinates startCoordinates, Coordinates endCoordinates) {
        int startRow = startCoordinates.getRow();
        int startColumn = startCoordinates.getColumn();
        int endRow = endCoordinates.getRow();
        int endColumn = endCoordinates.getColumn();
        System.out.println(startRow +"---------"+ startColumn);
        Piece figure = Board.board[startRow][startColumn];
        if (figure ==null) {
            System.out.println("沒有旗子 傻逼: " + startCoordinates);
            return;
        }


        System.out.println("Moving " + PieceType.getBycode(figure.getTypeCode()) + " from " + startCoordinates.getRow()+","+startCoordinates.getColumn() +
                " to " + endCoordinates.getRow()+ "," + endCoordinates.getColumn());
        for(Coordinates possibleMove: figure.getPossibleMovements()){
            if(Board.checkMovedValid(figure,endCoordinates)){
                System.out.println("有哪些座標:" + possibleMove.getRow()+ "," + possibleMove.getColumn());
                if(possibleMove.equals(endCoordinates)){
                    Board.board[endRow][endColumn] = figure;
                    figure.setCurrentCoordinates(endCoordinates);
                    figure.setPossibleMovements();
                    Board.board[startRow][startColumn] = null;
                    System.out.printf("\n Valid move %s -> %s == %s\n", startCoordinates, endCoordinates, possibleMove);
                    break;
                } else{
                    System.out.println("不是要移動到這邊");
                }
            }

        }
    }
}
