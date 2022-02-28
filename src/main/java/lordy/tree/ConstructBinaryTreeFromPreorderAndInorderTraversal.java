package lordy.tree;

/**
 * No.105
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public static TreeNode buildTree(int[] preorder, int[] inorder){
        if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }

        return helper(preorder, 0, preorder.length, inorder, 0, inorder.length);

    }

    public static TreeNode helper(int[] preorder, int pIndex, int pEnd, int[] inorder, int iIndex, int iEnd){
        if(pIndex == pEnd){
            return null;
        }
        int rootVal = preorder[pIndex];
        TreeNode root = new TreeNode(rootVal);
        int iRootIndex = 0;
        for(int i = 0; i < iEnd; i++){
            if(rootVal == inorder[i]){
                iRootIndex = i;
                break;
            }
        }
        int leftNum = iRootIndex - iIndex;
        root.left = helper(preorder, pIndex + 1, pIndex + leftNum + 1, inorder, iIndex, iRootIndex);
        root.right = helper(preorder, pIndex + leftNum + 1, pEnd, inorder, iRootIndex + 1, iEnd);
        return root;
    }
}
