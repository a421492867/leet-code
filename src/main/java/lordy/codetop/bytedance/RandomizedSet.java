package lordy.codetop.bytedance;

import java.util.*;

public class RandomizedSet {

    private Set<Integer> set;

    private List<Integer> list;

    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val){
        boolean flag = set.add(val);
        if (flag) list.add(val);
        return flag;
    }

    public boolean remove(int val){
        boolean flag = set.remove(val);
        if(flag) list.remove(list.indexOf(val));
        return flag;
    }

    public int getRandom(){
        if(list.isEmpty()) return -1;
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
