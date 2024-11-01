public class King extends ChessPiece {
    public King (String color) {
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

        if (a <= 1 || b <= 1) {
            toLine = line + a;
            toColumn = column + b;
            return true;
        };

        /* public static boolean isUnderAttack(ChessBoard board, int line, int column) {
            return ;
        } */

        return false;
    };

    @Override
    public String getSymbol() {
        return "K";
    };
}
