package lordy.codetop.jd;

import lordy.tree.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode235 {

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


    private void dfs(TreeNode node, Map<TreeNode, TreeNode> map){
        if(node == null) return;
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
