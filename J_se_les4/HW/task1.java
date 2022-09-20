package Java.J_se_les4.HW;

/*
 * +Написать программу, определяющую правильность расстановки скобок в
 * выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */
import java.util.ArrayDeque;

import javax.swing.border.StrokeBorder;

import Java.J_le_les1.task1.any;

public class task1 {
    static StringBuilder showError(int i) {
        StringBuilder error = new StringBuilder();
        for (int j = 0; j <= i; j++) {
            if (j < i) {
                error.append(" ");
            } else {
                error.append("^");
            }
        }
        return error;
    }

    public static void main(String[] args) {
        ArrayDeque<String> open = new ArrayDeque<>();

        String inputData = "[({a+(d*3)]<}";
        int i = 0;
        while (i < inputData.length()) {
            char tmp = inputData.charAt(i);
            if ((tmp == '(') | (tmp == '[') | (tmp == '{') | (tmp == '<')) {
                open.addLast(String.valueOf(tmp));
            } else if ((tmp == ')') | (tmp == ']') | (tmp == '}') | (tmp == '>')) {
                if ((tmp == ')')) {
                    boolean check = open.removeFirstOccurrence("(");
                    if (check == false) {
                        StringBuilder res = showError(i);
                        System.out.println(inputData);
                        System.out.printf("%s Wrong element here\n", res);
                        return;
                    }
                } else if ((tmp == ']')) {
                    boolean check = open.removeFirstOccurrence("[");
                    if (check == false) {
                        StringBuilder res = showError(i);
                        System.out.println(inputData);
                        System.out.printf("%s Wrong element here\n", res);
                        return;
                    }
                } else if ((tmp == '}')) {
                    boolean check = open.removeFirstOccurrence("{");
                    if (check == false) {
                        StringBuilder res = showError(i);
                        System.out.println(inputData);
                        System.out.printf("%s Wrong element here\n", res);
                        return;
                    }
                } else {
                    boolean check = open.removeFirstOccurrence("<");
                    if (check == false) {
                        StringBuilder res = showError(i);
                        System.out.println(inputData);
                        System.out.printf("%s Wrong element here\n", res);
                        return;
                    }
                }
            }
            i++;
        }
        if (open.isEmpty()) {
            System.out.printf("%s => true\n", inputData);
        } else {
            System.out.printf("%s => false\n", inputData);
            System.out.printf("'%s' Wrong element\n", open.pollFirst());
        }
    }
}
