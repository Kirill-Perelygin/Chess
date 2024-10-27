public class ChessPiece {
    String color;
    boolean check;

    public ChessPiece (String color) {
        this.color = color;
    };

    public String getColor() {
        return color;
    };
    public abstract canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return boolean;
    };

    public abstract getSymbol(){
        return getSymbol;
    }

}
