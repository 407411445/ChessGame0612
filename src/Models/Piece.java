package Models;

import BoardGame.Coordinates;
import StaticEnums.PieceColor;

public  abstract  class Piece {

    protected  final String typeCode;
    protected  final String colorCode;
    protected Coordinates currentCoordinates;
    protected Coordinates[] possibleMovements;


    public Piece(String typeCode, String colorCode) {
        this.typeCode = typeCode;
        this.colorCode = colorCode;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public Coordinates getCurrentCoordinates() {
        return currentCoordinates;
    }

    public void setCurrentCoordinates(Coordinates currentCoordinates) {
        this.currentCoordinates = currentCoordinates;
        setPossibleMovements();
    }

    public Coordinates[] getPossibleMovements() {
        return possibleMovements;
    }

    public abstract void setPossibleMovements();

    public static int[][]   getStartingCoordinates(String typeCode, String colorCode) {
        return  switch (typeCode){
            case "1" -> {
                if (colorCode.equals(PieceColor.White.getCode())){
                    yield new int[][]{
                            {0},{4}
                    };
                }
                else{
                    yield new int[][]{
                            {7},{4}
                    };
                }
            }
            case "2" -> {
                if (colorCode.equals(PieceColor.White.getCode())){
                    yield new int[][]{
                            {0},{3}
                    };
                }
                else{
                    yield new int[][]{
                            {7},{3}
                    };
                }
            }
            case "3" -> {
                if (colorCode .equals(PieceColor.White.getCode())){
                    yield new int[][]{
                            {0, 0},
                            {0, 7}
                    };
                }
                else{
                    yield new int[][]{
                            {7, 7},
                            {0, 7}
                    };
                }
            }
            case "4" -> {
                if (colorCode .equals(PieceColor.White.getCode())){
                    yield new int[][]{
                            {0, 0},
                            {2, 5}
                    };
                }
                else{
                    yield new int[][]{
                            {7, 7},
                            {2, 5}
                    };
                }
            }
            case "5" -> {
                if (colorCode .equals(PieceColor.White.getCode())){
                    yield new int[][]{
                            {0, 0},
                            {1, 6}
                    };
                }
                else{
                    yield new int[][]{
                            {7, 7},
                            {1, 6}
                    };
                }
            }
            case "6" -> {
                if (colorCode .equals(PieceColor.White.getCode())){
                    yield new int[][]{
                            {1, 1, 1, 1, 1, 1, 1, 1},
                            {0, 1, 2, 3, 4, 5, 6, 7}
                    };
                }
                else{
                    yield new int[][]{
                            {6, 6, 6, 6, 6, 6, 6, 6},
                            {0, 1, 2, 3, 4, 5, 6, 7}
                    };
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + typeCode);
        };
    }
}

