package StaticEnums;

public enum PieceColor {
    White("1","WHITE"),
    Black("2","BLACK"),
    Undefined("N/A","Undefined");
    private final String code;
    private final String messageKey;
    private PieceColor(String code, String messageKey) {
        this.code = code;
        this.messageKey = messageKey;

    }

    public String getCode() {
        return code;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public  static  PieceColor getBycode(String code){
        for(PieceColor pieceColor : PieceColor.values()){
            if(pieceColor.getCode().equals(code)){
                return pieceColor;
            }
        }
        return PieceColor.Undefined;
    }
}
