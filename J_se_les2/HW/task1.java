//Написать программу вычисления n-ого треугольного числа
package Java.J_se_les2.HW;

import java.util.Scanner;

public class task1 {
    static int countNTNumber(int n) {
        int tmp = 0;
        for (int i = 1; i <= n; i++)
            tmp += i;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n: ");
        int number = iScanner.nextInt();
        iScanner.close();
        System.out.printf("T(%d) = %d ", number, countNTNumber(number));
    }
}
