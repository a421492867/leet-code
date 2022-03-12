package lordy.hot100;

import lordy.tree.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        Map<TreeNode, TreeNode> map = new HashMap<>();
        dfs(root, map);
        Set<TreeNode> set = new HashSet<>();
        while (p != null){
            set.add(p);
            p = map.get(p);
        }
        while (q != null){
            if(set.contains(q)){
                return q;
            }
            q = map.get(q);
        }
        return null;

    }

    public void dfs(TreeNode root, Map<TreeNode, TreeNode> map){
        if(root == null) return;
        if(root.left != null){
            map.put(root.left, root);
            dfs(root.left, map);
        }
        if(root.right != null){
            map.put(root.right, root);
            dfs(root.right, map);
        }
    }
}
