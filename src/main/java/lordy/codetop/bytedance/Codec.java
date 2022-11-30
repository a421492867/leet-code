package lordy.codetop.bytedance;

import lordy.tree.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Codec {

    public String serialize(TreeNode root){
        return doSerialize(root, "");
    }

    public TreeNode deserialize(String data){
        String[] dataArray = data.split(",");
        List<String> dataList = new LinkedList<>(Arrays.asList(dataArray));
        return doDeserialize(dataList);
    }

    public String doSerialize(TreeNode node, String str){
        if(node == null){
            str += "None,";
        }else {
            str += node.val + ",";
            str = doSerialize(node.left, str);
            str = doSerialize(node.right, str);
        }
        return str;
    }

    public TreeNode doDeserialize(List<String> dataList){
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
