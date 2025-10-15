public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        boolean[][] mines = new boolean[m][n];
        int[][] board = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mines[i][j] = Math.random() < p;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mines[i][j]) continue;
                int count = 0;
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (x >= 0 && x < m && y >= 0 && y < n && mines[x][y]) {
                            count++;
                        }
                    }
                }
                board[i][j] = count;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mines[i][j]) System.out.print("* ");
                else System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
