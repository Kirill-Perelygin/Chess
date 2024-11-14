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

        if (a <= 1 && b <= 1) {
            toLine = line + a;
            toColumn = column + b;
            return true;
        };

        if (chessBoard.board[toLine][toColumn] != null) {
            if (!chessBoard.board[toLine][toColumn].getColor().equals(color)) return true;
        } else {
            return true;
        };

        return false;
    };



    public boolean isUnderAttack(ChessBoard board, int line, int column){
        for(int i = 0; i < 8; i ++) {
            for(int j = 0; j < 8; j ++) {
                var piece = board.board[i][j];
                if (piece != null && !piece.getColor().equals(color)
                        && piece.canMoveToPosition(board, i, j, line, column)) return true;
            }
        }
        return false;
    };

    @Override
    public String getSymbol() {
        return "K";
    };
}
