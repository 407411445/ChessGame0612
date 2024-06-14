package BoardGame;

import GameObject.*;
import Models.Piece;
import StaticEnums.PieceColor;
import StaticEnums.PieceType;

public class Board {
    public static Piece[][] board = new Piece[8][8];

    public Board(){
        boardSetUp();
    }


    public static boolean checkMovedValid(Piece piece,Coordinates coordinates){
        int row = coordinates.getRow();
        int column = coordinates.getColumn();
        System.out.println("末位置的座標="+ row +","+ column);
        if((row>=0 && row<8) && (column>=0 && column<8)){
            if(board[row][column] != null){
                Piece opponentPiece = board[row][column];
                return !opponentPiece.getColorCode().equals(piece.getColorCode());
            }
            else{
                return true;
            }
        }else{
            return false;
        }

    }




    public static void boardSetUp() {
        for (PieceType type : PieceType.values()) {
            for(PieceColor color : PieceColor.values()) {
               if(type == PieceType.Undefined || color == PieceColor.Undefined){
                   continue;
               }
                System.out.println(type + "//" + type.getCode() + "//" + color.getCode());
                int[][] positionOfPiece = Piece.getStartingCoordinates(type.getCode(),color.getCode());
                for(int i=0; i<positionOfPiece[0].length; i++){
                    int row = positionOfPiece[0][i];
                    int column = positionOfPiece[1][i];

                    Piece figure = switch (type.getCode()){
                        case "1" -> new King(type.getCode(), color.getCode());
                        case "2"-> new Queen(type.getCode(), color.getCode());
                        case "3" -> new Rook(type.getCode(), color.getCode());
                        case "4" -> new Bishop(type.getCode(), color.getCode());
                        case "5" -> new Knight(type.getCode(), color.getCode());
                        case "6" -> new Pawn(type.getCode(), color.getCode());
                        default -> throw new IllegalStateException("Unexpected value: " + type.getCode());
                    };

                    board[row][column] = figure;

                    figure.setCurrentCoordinates(new Coordinates(row,column));
                }
            }
        }

    }

    public String printBoard() {
        StringBuilder answer = new StringBuilder();
        for (Piece[] boardRows : board) {
            for (Piece figure : boardRows) {
                if (figure != null) {
                    answer.append("       ").append(PieceType.getBycode(figure.getTypeCode())).append("      ").append("||");
                } else {
                    answer.append("       null      ||");
                }
            }
            answer.append("\n");
        }
        return answer.toString();
    }
}
