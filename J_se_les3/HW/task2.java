package Java.J_se_les3.HW;

import java.lang.reflect.Array;

public class task2 {

    static void sort(int[] array){
        int n = array.length;

        for(int i = n / 2 - 1; i >= 0; i--) {
            heapify(array,n,i);
        }

        for(int i=n-1; i>=0; i--)
        {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;

            heapify(array,i,0);
        }
    }

    static void heapify(int array[], int n, int i){
        int max = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if((left < n) && (array[left] > array[max])) max = left;

        if((right < n) && (array[right] > array[max])) max = right;

        if(max != i){
            int tmpNum = array[i];
            array[i] = array[max];
            array[max] = tmpNum;

            heapify(array, n, max);
        }
    }
    public static void main(String[] args) {
        int[] array = {12,11,13,5,6,3,7};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

/*
1) Array: {12,11,13,5,6,3,7}
index = 0;
left index = 2 * index + 1
right index = 2 * index + 2                   12
(0) = 12                                   11    13
(2*0 +1) = 11                            5  6   3  7
(2*0 +2) = 13
(2*1 + 1) = 5

2) ищим макс и ставим в начало => 12(0)-13(2) => 13(0)-12(2)  {13,11,12,5,6,3,7} => check (2) - (3)or(4) => etc

3) меняем первое с последним. Array: {13,11,12,5,6,3,7} => Array: {7,11,12,5,6,3,13} array.len -1 till array.len != 1;
 */