package GameObject;

import BoardGame.Coordinates;
import Models.Piece;
import StaticEnums.PieceColor;

public class Pawn extends Piece {

    private boolean isFirstMove = true;

    public Pawn(String typeCode, String colorCode) {
        super(typeCode, colorCode);
    }

    @Override
    public void setPossibleMovements(){
        int currentRow = currentCoordinates.getRow();
        int currentColumn = currentCoordinates.getColumn();
        if (this.getColorCode().equals(PieceColor.White.getCode())){
            if(isFirstMove){
                isFirstMove = false;
                Coordinates coordinatesMoveOne = new Coordinates(currentRow +1 , currentColumn);
                Coordinates coordinatesMoveTwo = new Coordinates(currentRow +2 , currentColumn);

                Coordinates coordinatesCaptureThree = new Coordinates(currentRow +1 , currentColumn -1);
                Coordinates coordinatesCaptureFour = new Coordinates(currentRow +1 , currentColumn +1);

                this.possibleMovements = new Coordinates[]{
                        coordinatesMoveOne,
                        coordinatesMoveTwo,
                        coordinatesCaptureThree,
                        coordinatesCaptureFour
                };
            } else{
                Coordinates coordinatesMoveOne = new Coordinates(currentRow + 1, currentColumn);
                //captures
                Coordinates coordinatesCaptureThree = new Coordinates (currentRow + 1, currentColumn - 1);
                Coordinates coordinatesCaptureFour = new Coordinates(currentRow + 1, currentColumn + 1);

                this.possibleMovements = new Coordinates[]{
                        coordinatesMoveOne,
                        coordinatesCaptureThree,
                        coordinatesCaptureFour
                };
            }
        } else if (this.getColorCode().equals(PieceColor.Black.getCode())) {
            if(isFirstMove){
                isFirstMove = false;
                Coordinates coordinatesMoveOne = new Coordinates(currentRow - 1, currentColumn);
                Coordinates coordinatesMoveTwo = new Coordinates(currentRow - 2, currentColumn);
                //captures
                Coordinates coordinatesCaptureThree = new Coordinates(currentRow - 1, currentColumn - 1);
                Coordinates coordinatesCaptureFour = new Coordinates(currentRow - 1, currentColumn + 1);

                this.possibleMovements = new Coordinates[]{
                        coordinatesMoveOne,
                        coordinatesMoveTwo,
                        coordinatesCaptureThree,
                        coordinatesCaptureFour
                };
            }else {
                Coordinates coordinatesMoveOne = new Coordinates(currentRow - 1, currentColumn);
                //captures
                Coordinates coordinatesCaptureThree = new Coordinates(currentRow - 1, currentColumn - 1);
                Coordinates coordinatesCaptureFour = new Coordinates(currentRow - 1, currentColumn + 1);

                this.possibleMovements = new Coordinates[]{
                        coordinatesMoveOne,
                        coordinatesCaptureThree,
                        coordinatesCaptureFour
                };
            }
        }

//        int currentRow = currentCoordinates.getRow();
//        int currentColumn = currentCoordinates.getColumn();
//        int direction = this.getColorCode().equals(PieceColor.White.getCode()) ? -1 : 1;
//
//        if (isFirstMove) {
//            isFirstMove = false;
//            Coordinates moveOne = new Coordinates(currentRow + direction, currentColumn);
//            Coordinates moveTwo = new Coordinates(currentRow + 2 * direction, currentColumn);
//            Coordinates captureLeft = new Coordinates(currentRow + direction, currentColumn - 1);
//            Coordinates captureRight = new Coordinates(currentRow + direction, currentColumn + 1);
//
//            this.possibleMovements = new Coordinates[]{
//                    moveOne, moveTwo, captureLeft, captureRight
//            };
//        } else {
//            Coordinates moveOne = new Coordinates(currentRow + direction, currentColumn);
//            Coordinates captureLeft = new Coordinates(currentRow + direction, currentColumn - 1);
//            Coordinates captureRight = new Coordinates(currentRow + direction, currentColumn + 1);
//
//            this.possibleMovements = new Coordinates[]{
//                    moveOne, captureLeft, captureRight
//            };
//        }



    }

}
