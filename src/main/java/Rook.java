public class Rook extends ChessPiece {

    public Rook (String color) {
        super(color);
    };

    public String getColor() {
        return super.getColor();
    };

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (line == toLine && column == toColumn) {
            return false;
        };

        if (line > 7 || line < 0 || toLine > 7 || toLine < 0 || column > 7 || column < 0 || toColumn > 7 || toColumn < 0) {
            return false;
        };

        int a = Math.abs(toLine - line);
        int b = Math.abs(toColumn - column);

        if (toLine == line) {
            toColumn = column + b;
            return true;
        }
        else if (toColumn == column) {
            toLine = line + a;
            return true;
        };

        if (chessBoard.board[toLine][toColumn] != null) {
            if (!chessBoard.board[toLine][toColumn].getColor().equals(color)) return true;
        } else {
            return true;
        };

    return false;
    };

    @Override
    public String getSymbol() {
        return "R";
    };
}
