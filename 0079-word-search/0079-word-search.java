import java.util.ArrayList;

class Solution {
    int n, m;
    ArrayList<ArrayList<Integer>> direction;

    public Solution() {
        // Initialize direction ArrayList inside the constructor
        direction = new ArrayList<>();
        direction.add(new ArrayList<>(List.of(1, 0)));   // {1, 0} -> Right
        direction.add(new ArrayList<>(List.of(-1, 0)));  // {-1, 0} -> Left
        direction.add(new ArrayList<>(List.of(0, 1)));   // {0, 1} -> Down
        direction.add(new ArrayList<>(List.of(0, -1)));  // {0, -1} -> Up
    }

    public boolean find(ArrayList<ArrayList<Character>> board, int i, int j, int idx, String word) {
        if (idx == word.length())
            return true;
        if (i < 0 || j < 0 || i >= m || j >= n || board.get(i).get(j) == '$')
            return false;
        if (board.get(i).get(j) != word.charAt(idx))
            return false;
        char temp = board.get(i).get(j);
        board.get(i).set(j, '$');
        for (ArrayList<Integer> dir : direction) {
            int new_i = i + dir.get(0);
            int new_j = j + dir.get(1);
            if (find(board, new_i, new_j, idx + 1, word))
                return true;
        }
        board.get(i).set(j, temp);
        return false;
    }

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        ArrayList<ArrayList<Character>> boardList = new ArrayList<>();
        for (char[] row : board) {
            ArrayList<Character> rowList = new ArrayList<>();
            for (char ch : row) {
                rowList.add(ch);
            }
            boardList.add(rowList);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (boardList.get(i).get(j) == word.charAt(0) && find(boardList, i, j, 0, word))
                    return true;
            }
        }
        return false;
    }
}
