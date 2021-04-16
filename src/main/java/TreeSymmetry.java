public class TreeSymmetry {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.right.right = new TreeNode(4);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(4);

        System.out.println(node.isSymmetric(node));
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode () {}
        TreeNode (int value) {
            this.value = value;
        }
        public TreeNode (int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public boolean isSymmetric (TreeNode root) {
            return isInternalSymmetric(root, root);
        }

        private boolean isInternalSymmetric(TreeNode node1, TreeNode node2){
            if (node1 == null && node2 == null) return true;
            if (node1 == null || node2 == null ) return false;

            return (node1.value == node2.value)
                    && isInternalSymmetric(node1.left, node2.right)
                    && isInternalSymmetric(node2.left, node1.right);

        }
    }
}
