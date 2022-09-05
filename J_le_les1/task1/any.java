package Java.J_le_les1.task1;
import java.util.Scanner;
/**
 * any
 */
public class any {
    public static void main(String[] args) {
        // int [][] array = new int [2][3];
        // for(int i = 0; i < array.length; i++){
        //     for(int j = 0; j < array[i].length; j++){
        //         //System.out.printf("%d ", array[i][j]);
        //     }
        //     //System.out.println();
        // }
            // int a = 23414;
            // double b = Double.parseDouble("");
            // System.out.println(b);

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s", name);
        // System.out.println();
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("int b: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%s + %s = %s", x,y,x+y);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // //System.out.println(flag);
        // if(flag==true){
        // int x = iScanner.nextInt();
        // System.out.println(x);
        // iScanner.close();
        // }
        // else{
        // System.out.println("Wrong data");
        // }


        // String s = "dasda";
        // int a = 123;
        // String q = s + a;
        // System.out.println(q); 

        // int a = 1, b = 2;
        // int c = a +b;
        // String res = String.format("%d + %d = %d \n", a,b,c);
        // System.out.println(res);
        // System.out.printf("%d + %d = %d", a,b,c);
        
        // int mounth = 2;
        // String text = "";
        // switch (mounth){
        //     case 1:
        //     text = "Autumn";
        //     break;
        //     case 2:
        //     text = "Autumn2";
        //     break;
        //     case 3:
        //     text = "Autumn3";
        //     break;
        //     case 4:
        //     text = "Autumn4";
        //     break;
        //     case 5:
        //     text = "Autumn5";
        //     break;
        //     default:
        //     text = "mistake";
        //     break;
        // }
        // System.out.println(text);



        //test.sayHi();



        // int value = 321;
        // int count = 0;

        // do {
        //     value /= 10;
        //     count++;
        // } while (value > 0);
        // System.out.println(count);

        // String[] any = new String[] {"fawkjfhawjkfha", "fawkjfha", "fawjkfha","fawkfha","fhawjkfha"};
        // for (String item : any) {                   //forin
        //     System.out.println(item);
        // }




        
    }


    static String getType(Object o){                //type()
        return o.getClass().getSimpleName();
    }
}

/* 
                                                                                                                                    Cпецификатор формата вывода:

%d: целочисленных значений
%x: для вывода шестнадцатеричных чисел
%f: для вывода чисел с плавающей точкой
%e: для вывода чисел в экспоненциальной форме, 
например, 3.1415e+01
%c: для вывода одиночного символа
%s: для вывода строковых значений
*/