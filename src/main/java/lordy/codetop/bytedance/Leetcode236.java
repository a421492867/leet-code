package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return root;
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

    private void dfs(TreeNode node, Map map){
        if(node.left != null){
            map.put(node.left, node);
            dfs(node.left, map);
        }
        if(node.right != null){
            map.put(node.right, node);
            dfs(node.right, map);
        }
    }
}
