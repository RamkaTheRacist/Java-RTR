package Java.J_se_les4.HW;
//Сортировка слиянием
public class task2 {
    static void showArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    static void sortMerge(int[] arrayForSort, int size){
        if(size < 2) return;
        int middlePoint = size/2;
        int[] leftArr = new int[middlePoint];
        int[] rightArr = new int[size - middlePoint];
        for (int i = 0; i < middlePoint; i++) leftArr[i] = arrayForSort[i];
        for (int i = middlePoint; i < size; i++) rightArr[i - middlePoint] = arrayForSort[i];
        sortMerge(leftArr, middlePoint);
        sortMerge(rightArr, size - middlePoint);
        merge(arrayForSort, leftArr, rightArr, middlePoint, size-middlePoint);


    }
    static void merge(int[] arrayForSort, int[] leftArr, int[] rightArr, int leftIndex,int rightIndex){
        int leftIndexTMP = 0;
        int rightIndexTMP = 0;
        int arrforSortIndexTMP = 0;
        while(leftIndexTMP<leftIndex && rightIndexTMP<rightIndex){
            if(leftArr[leftIndexTMP]<=rightArr[rightIndexTMP]){
                arrayForSort[arrforSortIndexTMP] = leftArr[leftIndexTMP];
                leftIndexTMP++;
                arrforSortIndexTMP++;
            }else{
                arrayForSort[arrforSortIndexTMP] = rightArr[rightIndexTMP];
                rightIndexTMP++;
                arrforSortIndexTMP++;
            }
        }
        while(leftIndexTMP<leftIndex){
            arrayForSort[arrforSortIndexTMP] = leftArr[leftIndexTMP];
            leftIndexTMP++;
            arrforSortIndexTMP++;
        }
        while(rightIndexTMP<rightIndex){
            arrayForSort[arrforSortIndexTMP] = rightArr[rightIndexTMP];
            rightIndexTMP++;
            arrforSortIndexTMP++;
        }

    }
    public static void main(String[] args) {
        int[] array1 = new int[] {6,5,3,1,8,7,2,4};
        int[] array2 = new int[] {16,5,3,1,8,7,2,4,32};
        showArray(array1);
        System.out.println();
        sortMerge(array1, array1.length);
        showArray(array1);
        System.out.println();
        showArray(array2);
        System.out.println();
        sortMerge(array2, array2.length);
        showArray(array2);

    }
}
