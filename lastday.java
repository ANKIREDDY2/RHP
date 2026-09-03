class Solution {
    private int gci(int r, int c, int C) {
        return r * C + c + 1;
    }

    private int find(int[] ldr, int node) {
        if (ldr[node] != node) {
            ldr[node] = find(ldr, ldr[node]);
        }
        return ldr[node];
    }

    private void join(int[] ldr, int lt, int rt) {
        ldr[find(ldr, rt)] = find(ldr, lt);
    }

    public int latestDayToCross(int row, int col, int[][] cells) {

        int ldr[] = new int[row * col + 2];
        boolean water[] = new boolean[row * col + 2];

        for (int i = 0; i < ldr.length; i++)
            ldr[i] = i;

        int days = 0;

        int diff[][] = {
            {0, -1}, {0, 1}, {-1, 0}, {1, 0},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
        };

        for (int[] cell : cells) {

            int r = cell[0] - 1;
            int c = cell[1] - 1;

            int id = gci(r, c, col);
            water[id] = true;

            if (r == 0)
                join(ldr, 0, id);

            if (r == row - 1)
                join(ldr, row * col + 1, id);

            for (int i = 0; i < 8; i++) {
                int nr = r + diff[i][0];
                int nc = c + diff[i][1];

                if (nr >= 0 && nr < row && nc >= 0 && nc < col
                        && water[gci(nr, nc, col)]) {
                    join(ldr, id, gci(nr, nc, col));
                }
            }

            days++;

            if (find(ldr, 0) == find(ldr, row * col + 1))
                return days - 1;
        }

        return days;
    }
}
