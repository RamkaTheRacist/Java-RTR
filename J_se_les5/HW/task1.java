package Java.J_se_les5.HW;

import java.util.Scanner;
import java.util.ArrayDeque;

// Волновой алгоритм
// Все шаги за каждую итерацию
public class task1 {
    static int[][] createMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                matrix[i][j] = 0;
            }
        return matrix;
    }

    static void createObstacle(int[][] matrix, int count, int n, int m, int RowSP, int ColumnSP, int RowFP,
            int ColumnFP) {
        int tmp = 0;
        while (tmp < count) {
            int tmpN = (int) (Math.random() * n);
            int tmpM = (int) (Math.random() * m);
            matrix[tmpN][tmpM] = -1;
            tmp++;
        }
    }

    static void showMatrix(int n, int m, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static Boolean correctPath(int n, int m, int[][] matrix, int RowFP, int ColumnFP) {
        if ((check(n, m, matrix, RowFP - 1, ColumnFP) == true) || (check(n, m, matrix, RowFP + 1, ColumnFP) == true)
                || (check(n, m, matrix, RowFP, ColumnFP - 1) == true)
                || (check(n, m, matrix, RowFP, ColumnFP + 1) == true)) {
            return true;
        } else
            return false;
    }

    static Boolean check(int n, int m, int[][] matrix, int tmpN, int tmpM) {
        if ((tmpN >= 0) & (tmpN < n) & (tmpM >= 0) & (tmpM < m)) {
            if (matrix[tmpN][tmpM] == 0)
                return true;
            else if (matrix[tmpN][tmpM] == -3)
                return true;
            else
                return false;
        } else
            return false;
    }

    static Boolean checkReverse(int n, int m, int[][] matrix, int tmpN, int tmpM, int tmp) {
        if ((tmpN >= 0) & (tmpN < n) & (tmpM >= 0) & (tmpM < m)) {
            if (matrix[tmpN][tmpM] == tmp)
                return true;
            else
                return false;
        } else
            return false;
    }

    static boolean checkAnotherWays(int n, int m, int[][] matrix, ArrayDeque<Integer> deque) {
        boolean checked = false;
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                if (deque.peekFirst() != null) {
                    if (matrix[k][l] > deque.peekFirst()) {
                        checked = true;
                    }
                } else {
                    checked = false;
                }
            }
        }
        return checked;
    }

    static void removeAnotherWays(int n, int m, int[][] matrix, ArrayDeque<Integer> deque) {
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                if (matrix[k][l] > deque.peekFirst()) {
                    matrix[k][l] = 0;
                }
            }
        }
    }

    static void removeWrong(int n, int m, int[][] matrix, ArrayDeque<Integer> deque, int tmpN, int tmpM) {
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                if (matrix[k][l] == deque.peekFirst()) {
                    matrix[k][l] = 0;
                }
            }
        }
        matrix[tmpN][tmpM] = deque.pollFirst();
    }

    static void move(int n, int m, int[][] matrix, int tmpN, int tmpM, int tmp) {
        if (check(n, m, matrix, tmpN - 1, tmpM) == true) {
            matrix[tmpN - 1][tmpM] = tmp;
        }
        if (check(n, m, matrix, tmpN + 1, tmpM) == true) {
            matrix[tmpN + 1][tmpM] = tmp;
        }
        if (check(n, m, matrix, tmpN, tmpM - 1) == true) {
            matrix[tmpN][tmpM - 1] = tmp;
        }
        if (check(n, m, matrix, tmpN, tmpM + 1) == true) {
            matrix[tmpN][tmpM + 1] = tmp;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Columns of field: ");
        int m = iScanner.nextInt();
        System.out.printf("Rows of field: ");
        int n = iScanner.nextInt();
        System.out.printf("Start point: [Row] ");
        int RowSP = iScanner.nextInt();
        System.out.printf("Start point: [Column] ");
        int ColumnSP = iScanner.nextInt();
        System.out.printf("Finish point: [Row] ");
        int RowFP = iScanner.nextInt();
        System.out.printf("Finish point: [Column] ");
        int ColumnFP = iScanner.nextInt();
        System.out.printf("Count of obstacles: ");
        int obstacles = iScanner.nextInt();
        iScanner.close();
        int[][] matrix = createMatrix(n, m);
        createObstacle(matrix, obstacles, n, m, RowSP, ColumnSP, RowFP, ColumnFP);
        matrix[RowSP][ColumnSP] = -2;
        matrix[RowFP][ColumnFP] = -3;
        boolean foundPath = false;
        boolean createPath = false;
        int tmp = 1;
        int tmpN = RowSP;
        int tmpM = ColumnSP;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        showMatrix(n, m, matrix);
        if (correctPath(n, m, matrix, RowFP, ColumnFP) == false) {
            System.out.println("There`s no way");
        } else {
            while (foundPath == false) {
                if (deque.size() == 0) {
                    move(n, m, matrix, tmpN, tmpM, tmp);
                    deque.addFirst(tmp);
                    tmp++;
                } else {
                    for (int i = 0; i < n; i++) {
                        if (foundPath == false) {
                            for (int j = 0; j < m; j++) {
                                if (matrix[i][j] == deque.peekFirst()) {
                                    tmpN = i;
                                    tmpM = j;
                                    if ((tmpN == RowFP) & (tmpM == ColumnFP)) {
                                        foundPath = true;
                                        if (checkAnotherWays(n, m, matrix, deque) == true)
                                            removeAnotherWays(n, m, matrix, deque);
                                    } else {
                                        move(n, m, matrix, tmpN, tmpM, tmp);
                                    }
                                }
                            }
                        } else {
                            while (createPath == false) {

                                if (deque.size() == tmp - 1) {
                                    tmpN = RowFP;
                                    tmpM = ColumnFP;
                                    removeWrong(n, m, matrix, deque, tmpN, tmpM);
                                } else {
                                    if (deque.size() > 0) {
                                        if (checkReverse(n, m, matrix, tmpN - 1, tmpM, deque.peekFirst()) == true) {
                                            tmpN -= 1;
                                            removeWrong(n, m, matrix, deque, tmpN, tmpM);
                                        } else if ((checkReverse(n, m, matrix, tmpN + 1, tmpM,
                                                deque.peekFirst()) == true)) {
                                            tmpN += 1;
                                            removeWrong(n, m, matrix, deque, tmpN, tmpM);
                                        } else if ((checkReverse(n, m, matrix, tmpN, tmpM - 1,
                                                deque.peekFirst()) == true)) {
                                            tmpM -= 1;
                                            removeWrong(n, m, matrix, deque, tmpN, tmpM);
                                        } else if ((checkReverse(n, m, matrix, tmpN, tmpM + 1,
                                                deque.peekFirst()) == true)) {
                                            tmpM += 1;
                                            removeWrong(n, m, matrix, deque, tmpN, tmpM);
                                        }
                                    } else {
                                        createPath = true;
                                    }
                                }

                                Thread.sleep(1000);
                                showMatrix(n, m, matrix);
                            }

                        }
                    }
                    if (foundPath == false) {
                        deque.addFirst(tmp);
                        tmp++;
                    }
                    if ((foundPath == true) & (createPath == false)) {
                        while (createPath == false) {
                            if (deque.size() == tmp - 1) {
                                tmpN = RowFP;
                                tmpM = ColumnFP;
                                removeWrong(n, m, matrix, deque, tmpN, tmpM);
                            } else {
                                if (deque.size() > 0) {
                                    if (checkReverse(n, m, matrix, tmpN - 1, tmpM, deque.peekFirst()) == true) {
                                        tmpN -= 1;
                                        removeWrong(n, m, matrix, deque, tmpN, tmpM);
                                    } else if ((checkReverse(n, m, matrix, tmpN + 1, tmpM,
                                            deque.peekFirst()) == true)) {
                                        tmpN += 1;
                                        removeWrong(n, m, matrix, deque, tmpN, tmpM);
                                    } else if ((checkReverse(n, m, matrix, tmpN, tmpM - 1,
                                            deque.peekFirst()) == true)) {
                                        tmpM -= 1;
                                        removeWrong(n, m, matrix, deque, tmpN, tmpM);
                                    } else if ((checkReverse(n, m, matrix, tmpN, tmpM + 1,
                                            deque.peekFirst()) == true)) {
                                        tmpM += 1;
                                        removeWrong(n, m, matrix, deque, tmpN, tmpM);
                                    }
                                } else {
                                    createPath = true;
                                }
                            }
                            Thread.sleep(1000);
                            showMatrix(n, m, matrix);
                        }
                    }
                }
                Thread.sleep(1000);
                showMatrix(n, m, matrix);
            }
        }
        System.out.println("Right way:");
        showMatrix(n, m, matrix);
    }
}
