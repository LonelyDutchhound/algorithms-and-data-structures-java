import java.util.Objects;

public class MinInTree {
    public static void main(String[] args) {
        MinInTree.TreeNode node = new MinInTree.TreeNode(5);
        node.left = new MinInTree.TreeNode(3);
        node.right = new MinInTree.TreeNode(10);
        node.left.left = new MinInTree.TreeNode(4);
        node.right.right = new MinInTree.TreeNode(11);
        node.left.right = new MinInTree.TreeNode(4);
        node.right.left = new MinInTree.TreeNode(7);

        System.out.println(node.getMinInTree(node));
    }

    static class TreeNode {
        int value;
        MinInTree.TreeNode left;
        MinInTree.TreeNode right;

        TreeNode (int value) {
            this.value = value;
        }
        public TreeNode (int value, MinInTree.TreeNode left, MinInTree.TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public int getMinInTree(MinInTree.TreeNode root) {

            return getSubTreeMin(root);
        }

        private int getSubTreeMin(MinInTree.TreeNode node){
            if (node.right == null && node.left == null) return node.value;
            int minNode;

            if (node.right != null && node.left != null){
                minNode = Math.min(getSubTreeMin(node.right), getSubTreeMin(node.left));
            } else minNode = Objects.requireNonNullElseGet(node.right, () -> node.left).value;


            return Math.min(node.value, minNode);
        }
    }
}
