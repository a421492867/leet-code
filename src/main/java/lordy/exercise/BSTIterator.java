package lordy.exercise;

import lordy.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {

    List<Integer> list;
    int cur;
    int size;

    public BSTIterator(TreeNode root) {
        this.list = new ArrayList<>();
        this.cur = -1;
        inorder(root, this.list);
        this.size = this.list.size();
    }

    public int next(){
        if(hasNext()){
            return list.get(++cur);
        }
        return -1;
    }

    public boolean hasNext(){
        return (cur + 1) < size;
    }

    private void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
