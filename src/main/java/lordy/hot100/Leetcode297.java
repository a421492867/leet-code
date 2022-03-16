package lordy.hot100;

import lordy.tree.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode297 {

    public String serialize(TreeNode root){
        return doSerilize(root, "");
    }

    public TreeNode deserialize(String data){
        String[] dataArray = data.split(",");
        List<String> dataList = new LinkedList<>(Arrays.asList(dataArray));
        return doDeserialize(dataList);
    }

    private String doSerilize(TreeNode node, String str){
        if(node == null){
            str += "None,";
        }else {
            str += node.val + ",";
            str = doSerilize(node.left, str);
            str = doSerilize(node.right, str);
        }
        return str;
    }

    private TreeNode doDeserialize(List<String> dataList){
        if(dataList.get(0).equals("None")){
            dataList.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(dataList.get(0)));
        dataList.remove(0);
        root.left = doDeserialize(dataList);
        root.right = doDeserialize(dataList);
        return root;
    }
}
