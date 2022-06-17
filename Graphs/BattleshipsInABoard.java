public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int number = 0;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 'X') {
                    number++;
                    dfs(board, r, c);

                }
            }
        }
        return number;
    }

    public void dfs(char[][] board, int r, int c) {
        int nr = board.length;
        int nc = board[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || board[r][c] == '.') {
            return;
        }
        board[r][c] = '.';
        dfs(board, r - 1, c);
        dfs(board, r + 1, c);
        dfs(board, r, c - 1);
        dfs(board, r, c + 1);
    }
}

