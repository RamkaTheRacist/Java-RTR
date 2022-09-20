package Java.J_se_les4.HW;

import java.util.ArrayDeque;

import Java.J_le_les1.task1.any;

public class task1 {
    public static void main(String[] args) {
        ArrayDeque<String> open = new ArrayDeque<>();
        ArrayDeque<String> close = new ArrayDeque<>();
        // any.addFirst(1);
        // any.addFirst(2);
        // any.addFirst(3);
        // any.addFirst(3);
        // any.addFirst(4);
        // any.addFirst(5);
        // any.addFirst(6);
        // any.addFirst(7);
        // System.out.println(any);
        // System.out.println(any.getFirst());

        String inputData = "[a+(d*3)";
        for (int i = 0; i < inputData.length(); i++) {
            char tmp = inputData.charAt(i);
            if ((tmp == '(') | (tmp == '[') | (tmp == '{') | (tmp == '<')) {
                open.addFirst(String.valueOf(tmp));
            } else if ((tmp == ')') | (tmp == ']') | (tmp == '}') | (tmp == '>')) {
                close.addFirst(String.valueOf(tmp));
            }
        }
        System.out.println(open);
        System.out.println(close);
        System.out.println();
        // System.out.println(open.peekFirst());
        // System.out.println(open.getFirst());
        // open.removeFirstOccurrence(open.peekFirst());
        // System.out.println(close.removeFirstOccurrence(open.peekFirst()));
            // System.out.println(open.peekFirst());
            // String tmp = open.pollFirst();
            // if (tmp == "(") {
            //     boolean check = close.removeFirstOccurrence(")");
            //     if (check == false)
            //         System.out.println("false");
            //     else
            //         close.removeFirstOccurrence(")");
            // } else if (open.peekFirst() == "[") {
            //     boolean check = close.removeFirstOccurrence("]");
            //     if (check == false)
            //         System.out.println("false");
            //     else
            //         close.removeFirstOccurrence("]");
            // } else if (open.peekFirst() == "{") {
            //     boolean check = close.removeFirstOccurrence("}");
            //     if (check == false)
            //         System.out.println("false");
            //     else
            //         close.removeFirstOccurrence("}");
            // } else{
            //     boolean check = close.removeFirstOccurrence(">");
            //     if (check == false)
            //         System.out.println("false");
            //     else
            //         close.removeFirstOccurrence(">");
            // }
            
            // System.out.println(open);
            // System.out.println(close);
            String tmp = open.getFirst();
            String asfd = "(";
            //System.out.println(tmp);
            if(open.getFirst() != "(") System.out.println("any");
        



        // if(open.size() == close.size()){
        // System.out.println("any");
        // }else{
        // System.out.printf("%s - false", inputData);
        // }

    }
}

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