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

        if (getColor().equals("White") && line == 1) {
            int a = toLine - line;
            if (a == 1 || a == 2) {
                toLine = line + a;
                return true;
            };
        };

        if (getColor().equals("Black") && line == 1) {
            int a = toLine - line;
            if (a == 1 || a == 2) {
                toLine = line + a;
                return true;
            };
        };

        int a = toLine - line;
        if (a > 2) {
            return false;
        }
        else if (a == 1) {
            toLine = line + a;
        };
        return false;
    };

    @Override
    public String getSymbol() {
    return "P";
};

}

