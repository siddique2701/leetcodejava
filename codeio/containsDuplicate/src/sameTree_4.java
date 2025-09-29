import com.sun.source.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}

public class sameTree_4 {
    public static void main(String[] args) {
        // Create example trees:
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        boolean result = isSameTree(p, q);
        System.out.println(result); // Output: true
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p ==null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        else if (p.val == q.val)
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        return false;
    }
}
