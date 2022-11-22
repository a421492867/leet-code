package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

public class Leetcode105 {

    public TreeNode buildTree(int[] preorder, int[] inorder){
        if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }
        return helper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode helper(int[] preorder, int pIndex, int pEndIndex, int[] inorder, int iIndex, int iEndIndex){
        if(pIndex == pEndIndex) return null;
        int rootVal = preorder[pIndex];
        TreeNode root = new TreeNode(rootVal);

        int iRootIndex = 0;
        for(int i = 0; i < iEndIndex; i++){
            if(rootVal == inorder[i]){
                iRootIndex = i;
                break;
            }
        }

        int leftNum = iRootIndex - iIndex;
        root.left = helper(preorder, pIndex + 1, pIndex + leftNum + 1, inorder, iIndex, iRootIndex);
        root.right = helper(preorder, pIndex + leftNum + 1, pEndIndex, inorder, iRootIndex +1, iEndIndex);
        return root;
    }
}
