package Java.J_se_les6.HW.task2;

public class printIT {
    static void printTreeNLR(makeTree tree, String space) {
        if (tree != null) {
            System.out.printf("%s%d\n", space, tree.value);
            if (tree.left != null || tree.right != null) {
                printTreeNLR(tree.left, space + "\t");
                printTreeNLR(tree.right, space + "\t");
            }
        } else {
            System.out.printf("%snil\n", space);
        }
    }

    static void printTreeNRL(makeTree tree, String space){
        if (tree != null) {
            System.out.printf("%s%d\n", space, tree.value);
            if (tree.right != null || tree.left != null) {
                printTreeNRL(tree.right, space + "\t");
                printTreeNRL(tree.left, space + "\t");
            }
        } else {
            System.out.printf("%snil\n", space);
        }
    }

    static void printTreeLNR(makeTree tree, String space){
        if(tree != null){
            if(tree.left != null){
                printTreeLNR(tree.left, space + "\t");
                System.out.printf("%s%d\n", space, tree.value);
                printTreeLNR(tree.right, space + "\t");
            }else{
                System.out.printf("%s%d\n", space, tree.value);
            }
        }
        
    }

    static void printTreeRNL(makeTree tree, String space){
        if(tree != null){
            if(tree.right != null){
                printTreeRNL(tree.right, space + "\t");
                System.out.printf("%s%d\n", space, tree.value);
                printTreeRNL(tree.left, space + "\t");
            }else{
                System.out.printf("%s%d\n", space, tree.value);
            }
        }
        
    }
}
