public class Pawn extends ChessPiece {

    public Pawn (String color) {
        super(color);
    };

    public String getColor() {
        return super.getColor();
    };

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line == toLine && column == toColumn) {
            return false;
        };

        if (line > 7 || line < 0 || toLine > 7 || toLine < 0 || column > 7 || column < 0 || toColumn > 7 || toColumn < 0) {
            return false;
        };

        if (getColor().equals("White") && line == 1 && toColumn == column) {
            int a = toLine - line;
            if (Math.abs(a) == 1 || Math.abs(a) == 2) {
                toLine = line + a;
                return true;
            };
        };

        if (getColor().equals("Black") && line == 6 && toColumn == column) {
            int a = toLine - line;
            if (Math.abs(a) == 1 || Math.abs(a) == 2) {
                toLine = line + a;
                return true;
            };
        };

        int a = toLine - line;
        if (Math.abs(a) > 2) {
            return false;
        }
        else if (Math.abs(a) == 1 && toColumn == column) {
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
    return "P";
};

}

