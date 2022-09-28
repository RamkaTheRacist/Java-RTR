package Java.J_se_les6.HW.task2;

public class prog {
    public static void main(String[] args) {
        makeTree mainTree = new makeTree(1);
        makeTree left = new makeTree(2);
        makeTree right = new makeTree(3);
        makeTree rightLeft = new makeTree(6);
        makeTree rightRight = new makeTree(7);
        makeTree leftLeft = new makeTree(4);
        makeTree leftRight = new makeTree(5);
        makeTree leftLeftLeft = new makeTree(8);
        makeTree leftLeftRight = new makeTree(9);
        makeTree leftRightLeft = new makeTree(10);
        mainTree.left = left;
        mainTree.right = right;
        left.left = leftLeft;
        left.right = leftRight;
        right.left = rightLeft;
        right.right = rightRight;
        leftLeft.left = leftLeftLeft;
        leftLeft.right = leftLeftRight;
        leftRight.left = leftRightLeft;

        // printIT.printTreeNLR(mainTree, "");
        // System.out.println();
        // printIT.printTreeNRL(mainTree, "");
        // System.out.println();
        // printIT.printTreeLNR(mainTree, "");
        // System.out.println();
        // printIT.printTreeRNL(mainTree, "");
        // System.out.println();

    }
}
