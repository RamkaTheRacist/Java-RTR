//длина наибольшей общей подпоследовательности
// [2, 3, 4, 5, 6, 7, 8, 9, 1, 2]
// [0, 3, 1, 4, 5, 6, 1, 2, 1, 8, 4]

//   , 3, 4, 5, 6,  ,  ,  , 1, 2
//   , 3,  , 4, 5, 6, 1, 2,  ,  ,  
package Java.J_se_les2;

import java.util.ArrayList;

public class task1 {
    static String anyFunc(int[] firstArray, int[] secondArray,int fa, int tmpIndex){
        String tmp = "";
        for (int i = fa; i < firstArray.length; i++) {
            for (int k = 0; k < secondArray.length; k++) {
                if(firstArray[i] == secondArray[k]){
                    if(tmpIndex < k){
                        tmpIndex = k;
                        tmp+= " " + firstArray[i];
                        break;
                    }
                }
    
            }
               
        }
        return tmp;
    }           

    public static void main(String[] args) {
        int[] firstArray = new int[] { 2, 3, 4, 1, 5, 6, 7, 8, 9, 1, 2, 8, 5};
        int[] secondArray = new int[] { 0, 3, 1, 4, 5, 6, 1, 2, 1, 8, 4,1,5 };

        ArrayList<Integer> firstArrayTMP = new ArrayList<Integer>();
        ArrayList<Integer> secondArrayTMP = new ArrayList<Integer>();

        ArrayList<Integer> resultTMP1 = new ArrayList<Integer>();
        ArrayList<Integer> resultTMP2 = new ArrayList<Integer>();

        ArrayList<Integer> TMP1 = new ArrayList<Integer>();
        ArrayList<Integer> TMP2 = new ArrayList<Integer>();


        for (int i = 0; i < firstArray.length; i++)
            firstArrayTMP.add(firstArray[i]);
        for (int i = 0; i < secondArray.length; i++)
            secondArrayTMP.add(secondArray[i]);
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(firstArrayTMP);
        System.out.println(secondArrayTMP);
        String tmp = "";
        int tmpIndex = -1;
        int fa = 0;
        while(fa < firstArray.length){
            tmp = anyFunc(firstArray, secondArray, fa, tmpIndex);
            fa++;
            System.out.println(tmp);
            
        }
            
        
        

        

        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    }
}
