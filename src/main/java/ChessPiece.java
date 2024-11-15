public abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece (String color) {
        this.color = color;
    };

    public String getColor() {
        return color;
    };

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol();

}
