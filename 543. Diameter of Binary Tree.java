

class  DiameterOfBinaryTree {
    // Time Complexity: O(N)
    // Avoid to call the recursive function twice for each node
    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = recHelper(root);
        return result[0];

        // if (root == null) {
        //     return 0;
        // }

        // // CASE 1: GOES THROUGH ROOT
        // int lPath = longestPath(root.left); // return longest + 
        // int rPath = longestPath(root.right);
        // int throughRoot = lPath + rPath;


        // // CASE 2: DOES NOT GO THROUGH ROOT
        // int leftDiameter = diameterOfBinaryTree(root.left);
        // int rightDiameter = diameterOfBinaryTree(root.right);
        // int maxSubtreeDiameter = Math.max(leftDiameter, rightDiameter);

        // return throughRoot>maxSubtreeDiameter ? throughRoot : maxSubtreeDiameter;
    }

    // Time Complexity: O(n)
    public int longestPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(longestPath(root.left), longestPath(root.right));
    }

    // Time Complexity: O(n)
    // Index 0 is the diameter
    // Index 1 is the longest path
    private int[] recHelper(TreeNode node){
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] left = recHelper(node.left);
        int[] right = recHelper(node.right);
        int[] res = new int[2];
        res[0] = Math.max(left[0], right[0]) + 1;
        res[1] = Math.max(left[0] + right[0], Math.max(left[1], right[1]));
        return res;
    }
    public static void main(String[] args) {
        
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
       this.left = left;
        this.right = right;
    }
}

