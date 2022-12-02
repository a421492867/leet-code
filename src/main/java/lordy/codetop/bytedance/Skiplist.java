package lordy.codetop.bytedance;

public class Skiplist {

    class Node{
        Integer value;
        Node[] next;

        public Node(Integer value, int size) {
            this.value = value;
            this.next = new Node[size];
        }
    }

    private static int DEFAULT_MAX_LEVEL = 32;

    private static double DEFAULT_P_FACTOR = 0.25;

    Node head;

    int currentLevel = 1;

    public Skiplist() {
        head = new Node(null, DEFAULT_MAX_LEVEL);
    }


    public boolean search(int target){
        Node searchNode = head;
        for(int i = currentLevel - 1; i >=0; i--){
            searchNode = findCloses(searchNode, i, target);
            if(searchNode.next[i] != null && searchNode.next[i].value == target){
                return true;
            }
        }
        return false;
    }

    public void add(int num){
        int level = randomLevel();
        Node updateNode = head;
        Node newNode = new Node(num, level);
        for(int i = currentLevel - 1; i >= 0; i--){
            updateNode = findCloses(updateNode, i, num);
            if(i < level){
                if(updateNode.next[i] == null){
                    updateNode.next[i] = newNode;
                }else{
                    Node temp = updateNode.next[i];
                    updateNode.next[i] = newNode;
                    newNode.next[i] = temp;
                }
            }
        }
        if(level > currentLevel){
            for(int i = currentLevel; i < level; i++){
                head.next[i] = newNode;
            }
            currentLevel = level;
        }
    }

    public boolean erase(int num){
        boolean flag = false;
        Node searchNode = head;
        for(int i = currentLevel - 1; i >= 0; i--){
            searchNode = findCloses(searchNode, i, num);
            if(searchNode.next[i] != null && searchNode.next[i].value == num){
                searchNode.next[i] = searchNode.next[i].next[i];
                flag = true;
                continue;
            }
        }
        return flag;
    }

    public Node findCloses(Node node, int levelIndex, int val){
        while ((node.next[levelIndex] != null) && val > node.next[levelIndex].value){
            node = node.next[levelIndex];
        }
        return node;
    }

    private static int randomLevel(){
        int level = 1;
        while (Math.random() < DEFAULT_P_FACTOR && level < DEFAULT_MAX_LEVEL){
            level++;
        }
        return level;
    }
}
