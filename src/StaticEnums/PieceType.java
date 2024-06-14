package StaticEnums;

public enum PieceType {
    King("1","KING"),
    Queen("2","QUEEN"),
    Rook("3","ROOK"),
    Bishop("4","BISHOP"),
    Knight("5","KNIGHT"),
    Pawn("6","PAWN"),
    Undefined("N/A","Undefined");

    private final String code;
    private final String messageKey;

    PieceType(String code, String messageKey) {
        this.code =code;
        this.messageKey =messageKey;
    }

    public String getCode() {
        return code;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public static  PieceType getBycode(String code){
        for(PieceType pieceType : PieceType.values()){
            if(pieceType.getCode().equals(code)){
                return pieceType;
            }
        }
        return PieceType.Undefined;
    }


}
