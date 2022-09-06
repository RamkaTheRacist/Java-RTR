/*
 * Решить задачу с маршрутами через рекурсию
 * Показать хотя бы один маршрут (done)
 */

package Java.J_se_les1.HW;

import java.util.Scanner;

public class task1 {
    static void solveRe(int a, int b, int c, int d, int[] array, int index) {
        if (index > b)
            return;
        else if ((index % d == 0) && (index - c >= 0))
            array[index] = array[index - c] + array[index / d];
        else if (index - c >= 0)
            array[index] = array[index - c];
        else if (index % d == 0)
            array[index] = array[index / d];
        solveRe(a, b, c, d, array, index + 1);
    }

    static String bestWay(int a, int b, int c, int d) {
        int tmp = b;
        String result = "";
        if (d > 1) {
            while (tmp != a) {
                if (tmp % d == 0) {
                    tmp /= d;
                    result += " cmd2";
                } else {
                    tmp -= c;
                    result += " cmd1";
                }
            }
        } else {
            while (tmp != a) {
                tmp -= c;
                result += " cmd1";
            }
        }
        String[] splited = result.split(" ");
        result = splited[0];
        for (int i = 0; i < splited.length - 1; i++) {
            result += " " + splited[(splited.length - 1) - i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("First number: ");
        int firstNumber = iScanner.nextInt();
        System.out.printf("Second number: ");
        int secondNumber = iScanner.nextInt();
        System.out.printf("Plus number (cmd1): ");
        int plusThis = iScanner.nextInt();
        System.out.printf("Multiply number (cmd2): ");
        int multiplyThis = iScanner.nextInt();
        iScanner.close();
        if ((firstNumber > secondNumber) || (multiplyThis < 2) & (plusThis < 1))
            System.out.printf("From %d to %d is no way", firstNumber, secondNumber);
        else {
            int[] array = new int[secondNumber + 1];
            array[firstNumber] = 1;
            int index = firstNumber + 1;
            solveRe(firstNumber, secondNumber, plusThis, multiplyThis, array, index);

            if ((array[secondNumber] == 0))
                System.out.printf("From %d to %d is no way", firstNumber, secondNumber);
            else {
                for (int i = 0; i < array.length; i++) {
                    System.out.printf("To %d is %d ways\n", i, array[i]);
                }
                System.out.printf("From %d to %d the best way is: %s\n", firstNumber, secondNumber,
                        bestWay(firstNumber, secondNumber, plusThis, multiplyThis));

            }
        }

    }
}
