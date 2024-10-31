public class Bishop extends ChessPiece {
    public Bishop (String color) {
        super(color);
    };

    public String getColor() {
        return super.getColor();
    };

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return true;
    };

    @Override
    public String getSymbol() {
        return "B";
    };

}
