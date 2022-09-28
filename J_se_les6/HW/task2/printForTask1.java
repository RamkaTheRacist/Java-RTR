package Java.J_se_les6.HW.task2;
// 1(2(4(8,9),5(10)),3(6,7))
public class printForTask1 {
    static void printTreeInLine(makeTree tree, String space){
        if (tree != null) {
            System.out.printf("%d", tree.value);
            if (tree.left != null || tree.right != null) {
                space = "(";
                System.out.print(space);
                printTreeInLine(tree.left, space="(");
                System.out.print(",");
                printTreeInLine(tree.right, space=",");
                System.out.print(")");
                
            }
        }else{
            System.out.printf("nil");
        }
    }
}
