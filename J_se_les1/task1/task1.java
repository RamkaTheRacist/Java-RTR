/*+На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
- команда 1 (к1): увеличить в с раза, а умножается на c
- команда 2 (к2): увеличить на d, к a прибавляется d
написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
Пример 1: а = 1, b = 7, c = 2, d = 1
ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
Можно начать с более простого – просто подсчёта общего количесвтва вариантов 
Пример 2: а = 11, b = 7, c = 2, d = 1
ответ: нет решения. 
*Подумать над тем, как сделать минимальное количество команд */

package Java.J_se_les1.task1;
import java.util.Scanner;
public class task1 {

    static int[] solve(int a, int b, int c, int d) {
        int[] array = new int[b + 1];
        array[a] = 1;
        for (int index = a + 1; index <= b; index++) {
            if (index < c) {
                if (index % d == 0) {
                    array[index] = array[index] + array[index / d];
                }
            } else {
                if (index % d == 0) {
                    array[index] = array[index - c] + array[index / d];
                } else {
                    array[index] = array[index - c];
                }
            }
        }
        return array;
    }

    static String bestWay(int a, int b, int c, int d) {
        int tmp = b;
        String result = Integer.toString(a);
        while (tmp != a) {
            if (tmp % d == 0) {
                tmp /= d;
                result += " *" + Integer.toString(d);
            } else {
                tmp -= c;
                result += " +" + Integer.toString(c);
            }
        }
        String[] splited = result.split(" ");
        result = splited[0];
        for (int i = 0; i < splited.length - 1; i++) {
            result += "" + splited[(splited.length - 1) - i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("First number: ");
        int firstNumber = iScanner.nextInt();
        System.out.printf("Second number: ");
        int secondNumber = iScanner.nextInt();
        System.out.printf("Plus number: ");
        int plusThis = iScanner.nextInt();
        System.out.printf("Multiply number: ");
        int multiplyThis = iScanner.nextInt();
        iScanner.close();
        var res = solve(firstNumber, secondNumber, plusThis, multiplyThis);
        if (res[secondNumber] == 0)
            System.out.printf("From %d to %d is no way", firstNumber, secondNumber);
        else {
            System.out.printf("From %d to %d the best way is: %s", firstNumber, secondNumber, bestWay(firstNumber, secondNumber, plusThis, multiplyThis));
        }

    }
}