package lordy.codetop.bytedance;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LFUCache {

    int cap;
    int minFreq;

    Map<Integer, Integer> keyToVal;
    Map<Integer, Integer> keyToFreq;
    Map<Integer, LinkedHashSet<Integer>> freqToKeys;

    public LFUCache(int cap) {
        this.cap = cap;
        this.minFreq = 0;
        keyToVal = new HashMap<>();
        keyToFreq = new HashMap<>();
        freqToKeys = new HashMap<>();
    }

    public int get(int key){
        if(!keyToVal.containsKey(key)) return -1;
        increaseKeyFreq(key);
        return keyToVal.get(key);
    }

    public void put(int key, int value){
        if(cap <= 0) return;
        if(keyToVal.containsKey(key)){
            keyToVal.put(key, value);
            increaseKeyFreq(key);
            return;
        }
        if(keyToVal.size() >= cap){
            removeMinFreqKey();
        }

        keyToVal.put(key, value);
        keyToFreq.put(key, 1);
        freqToKeys.putIfAbsent(1, new LinkedHashSet<>());
        freqToKeys.get(1).add(key);
        minFreq = 1;
    }

    private void increaseKeyFreq(int key){
        Integer originFreq = keyToFreq.get(key);
        Integer curFreq = originFreq + 1;
        keyToFreq.put(key, curFreq);
        Set<Integer> set = freqToKeys.get(originFreq);
        set.remove(key);
        if(set.isEmpty()){
            freqToKeys.remove(originFreq);
            if(originFreq == minFreq){
                minFreq++;
            }
        }
        freqToKeys.putIfAbsent(curFreq, new LinkedHashSet<>());
        freqToKeys.get(curFreq).add(key);
    }

    private void removeMinFreqKey(){
        Set<Integer> minSet = freqToKeys.get(minFreq);
        Integer minFreqKey = minSet.iterator().next();
        minSet.remove(minFreqKey);
        if(minSet.isEmpty()){
            freqToKeys.remove(minFreq);
            minFreqKey++;
        }
        keyToFreq.remove(minFreqKey);
        keyToVal.remove(minFreqKey);
    }


}
