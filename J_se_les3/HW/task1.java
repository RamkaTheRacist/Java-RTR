//Написать программу, показывающую последовательность действий для игры “Ханойская башня”
//Задача состоит в том, чтобы перенести пирамиду из восьми колец за наименьшее число ходов на другой стержень. 
//За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.
package Java.J_se_les3.HW;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    static void showPosition(int n, int m, String[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // if(array[i][j] != null)
                System.out.printf("%s \t", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static String buildStr(int n) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 1; i <= n; i++)
            tmp.append("*");
        return tmp.toString();
    }

    static String[][] createMatrix(int n) {
        int m = 3;
        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                matrix[i][j] = "";
                matrix[i][0] = buildStr(i + 1);
            }
        return matrix;
    }

    static int[] searchIndex(int n, int m, String[][] matrix, String[] array, int z) {
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[z] == matrix[i][j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    static Boolean checkAbove(int[] indexs, String[][] matrix) {
        if (indexs[0] > 0) {
            if (matrix[indexs[0] - 1][indexs[1]] == "") {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    static void moving(int[] indexs, String[][] matrix, int tmpN, int tmpM) {
        String tmp = matrix[tmpN][tmpM];
        matrix[tmpN][tmpM] = matrix[indexs[0]][indexs[1]];
        matrix[indexs[0]][indexs[1]] = tmp;
    }

    static Boolean winOrNot(String[] array, String[][] matrix, int n, int m){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(array[i].length()==matrix[i][m-1].length())count++;
        }
        if(count == n) return true;
        else return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Height of first column: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int m = 3;
        String[][] matrix = createMatrix(n);
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++)
            array[i] = matrix[i][0];
        showPosition(n, m, matrix);
        System.out.println();
        boolean winCondition = false;
        int i = 0;
        int tmpN = n - 1;
        int tmpM = m - 1;
        int moves = 0;
        while (winCondition == false) {
            if (matrix[tmpN][tmpM] == "") {
                int[] indexs = searchIndex(n, m, matrix, array, i);
                if (checkAbove(indexs, matrix) == true) {
                    Thread.sleep(900);
                    moving(indexs, matrix, tmpN, tmpM);
                    moves++;
                    System.out.printf("moves = %d\n", moves);
                    showPosition(n, m, matrix);
                    tmpN = n - 1;
                    tmpM = m - 1;
                    if (i < n - 1) {
                        i++;
                    } else {
                        i = 0;
                    }
                } else {
                    tmpN = n - 1;
                    tmpM = m - 1;
                    if (i < n - 1) {
                        i++;
                    } else {
                        i = 0;
                    }
                }
            } else {
                if(array[i].length() > matrix[tmpN][tmpM].length()){
                    tmpN = n - 1;
                    if(tmpM > 0){
                        tmpM--;
                    }else{ 
                        tmpM = m - 1;
                        if (i < n - 1) {
                            i++;
                        } else {
                            i = 0;
                        }
                    }
                }else if(array[i].length() == matrix[tmpN][tmpM].length()){
                    tmpN = n - 1;
                    if(tmpM > 0){
                        tmpM--;
                    }else{ 
                        tmpM = m - 1;
                        if (i < n - 1) {
                            i++;
                        } else {
                            i = 0;
                        }
                    }
                }else{
                    if(tmpN > 0) tmpN--;
                    else tmpN = n-1;
                }
            }
            winCondition = winOrNot(array, matrix, n, m);
        }
    }
}