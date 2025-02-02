package unit11;

import java.io.File;
import java.lang.Object;
import java.nio.file.Files;
import java.nio.file.Path;
import java.lang.Integer;

public class EulerEleven {

    int[][] grid = new int[20][20];
    // int large = Integer.MIN_VALUE;
    int large = 0;

    public EulerEleven() {

        String[][] stringGrid = new String[20][20];
        stringGrid[0] = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08".split(" ");
        stringGrid[1] = "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00".split(" ");
        stringGrid[2] = "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65".split(" ");
        stringGrid[3] = "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91".split(" ");
        stringGrid[4] = "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80".split(" ");
        stringGrid[5] = "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50".split(" ");
        stringGrid[6] = "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70".split(" ");
        stringGrid[7] = "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21".split(" ");
        stringGrid[8] = "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72".split(" ");
        stringGrid[9] = "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95".split(" ");
        stringGrid[10] = "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92".split(" ");
        stringGrid[11] = "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57".split(" ");
        stringGrid[12] = "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58".split(" ");
        stringGrid[13] = "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40".split(" ");
        stringGrid[14] = "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66".split(" ");
        stringGrid[15] = "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69".split(" ");
        stringGrid[16] = "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36".split(" ");
        stringGrid[17] = "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16".split(" ");
        stringGrid[18] = "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54".split(" ");
        stringGrid[19] = "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48".split(" ");
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 20; c++) {
                grid[r][c] = Integer.parseInt(stringGrid[r][c]);
            }
        }

    }

    public boolean canGoN(int r, int c) {
        if ((c >= 0 && c < 20) && (r >= 0 && r < 20) && (r - 1 >= 0 && r - 1 < 20) && (r - 2 >= 0 && r - 2 < 20)
                && (r - 3 >= 0 && r - 3 < 20)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canGoS(int r, int c) {
        if ((c >= 0 && c < 20) && (r >= 0 && r < 20) && (r + 1 >= 0 && r + 1 < 20) && (r + 2 >= 0 && r + 2 < 20)
                && (r + 3 >= 0 && r + 3 < 20)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canGoE(int r, int c) {

        if ((c >= 0 && c < 20) && (r >= 0 && r < 20) && (c + 1 >= 0 && c + 1 < 20) && (c + 2 >= 0 && c + 2 < 20)
                && (c + 3 >= 0 && c + 3 < 20)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canGoW(int r, int c) {
        if ((c >= 0 && c < 20) && (r >= 0 && r < 20) && (c - 1 >= 0 && c - 1 < 20) && (c - 2 >= 0 && c - 2 < 20)
                && (c - 3 >= 0 && c - 3 < 20)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canGoNW(int r, int c) {
        if (canGoN(r, c) && canGoW(r, c)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canGoNE(int r, int c) {
        if (canGoN(r, c) && canGoE(r, c)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canGoSE(int r, int c) {
        if (canGoS(r, c) && canGoE(r, c)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canGoSW(int r, int c) {
        if (canGoS(r, c) && canGoW(r, c)) {
            return true;
        } else {
            return false;
        }
    }

    public void runAllDirections(int r, int c) {
        // checks if canMultiply for every direction, multiplies, then compares with
        // largest product
       
        if (canGoN(r, c)) {
            if ((grid[r][c] * grid[r - 1][c] * grid[r - 2][c] * grid[r - 3][c]) > large) {
                large = (grid[r][c] * grid[r - 1][c] * grid[r - 2][c] * grid[r - 3][c]);
            }
        }
        if (canGoS(r, c)) {
            if ((grid[r][c] * grid[r + 1][c] * grid[r + 2][c] * grid[r + 3][c]) > large) {
                large = (grid[r][c] * grid[r + 1][c] * grid[r + 2][c] * grid[r + 3][c]);
            }
        }
        if (canGoE(r, c)) {
            if ((grid[r][c] * grid[r][c + 1] * grid[r][c + 2] * grid[r][c + 3]) > large) {
                large = (grid[r][c] * grid[r][c + 1] * grid[r][c + 2] * grid[r][c + 3]);
            }
        }
        if (canGoW(r, c)) {
            if ((grid[r][c] * grid[r][c - 1] * grid[r][c - 2] * grid[r][c - 3]) > large) {
                large = (grid[r][c] * grid[r][c - 1] * grid[r][c - 2] * grid[r][c - 3]);
            }
        }
        if (canGoNW(r, c)) {
            if ((grid[r][c] * grid[r - 1][c - 1] * grid[r - 2][c - 2] * grid[r - 3][c - 3]) > large) {
                large = (grid[r][c] * grid[r - 1][c - 1] * grid[r - 2][c - 2] * grid[r - 3][c - 3]);
            }
        }
        if (canGoNE(r, c)) {
            if ((grid[r][c] * grid[r - 1][c + 1] * grid[r - 2][c + 2] * grid[r - 3][c + 3]) > large) {
                large = (grid[r][c] * grid[r - 1][c + 1] * grid[r - 2][c + 2] * grid[r - 3][c + 3]);
            }
        }
        if (canGoSE(r, c)) {
            if ((grid[r][c] * grid[r + 1][c + 1] * grid[r + 2][c + 2] * grid[r + 3][c + 3]) > large) {
                large = (grid[r][c] * grid[r + 1][c + 1] * grid[r + 2][c + 2] * grid[r + 3][c + 3]);
            }
        }
        if (canGoSW(r, c)) {
            if ((grid[r][c] * grid[r + 1][c - 1] * grid[r + 2][c - 2] * grid[r + 3][c - 3]) > large) {
                large = (grid[r][c] * grid[r + 1][c - 1] * grid[r + 2][c - 2] * grid[r + 3][c - 3]);
            }
        }
    }

    public int loopThroughGrid() {
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 20; c++) {
                runAllDirections(r, c);
            }
        }
        return large;
    }

    public static void main(String[] args) {
        EulerEleven run = new EulerEleven();

        System.out.println(run.loopThroughGrid());
    }

}
