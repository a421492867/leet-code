package lordy.codetop.bytedance;

import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> queMin;
    PriorityQueue<Integer> queMax;

    public MedianFinder() {
        queMin = new PriorityQueue<Integer>((o1, o2) -> {return o2 - o1;});
        queMax = new PriorityQueue<Integer>((o1, o2) -> {return o1 - o2;});
    }

    public void addNum(int num){
        if(queMin.isEmpty() || num <= queMin.peek()){
            queMin.offer(num);
            if(queMax.size() + 1 < queMin.size()){
                queMax.offer(queMin.poll());
            }
        }else {
            queMax.offer(num);
            if(queMax.size() > queMin.size()){
                queMin.offer(queMax.poll());
            }
        }
    }

    public double findMedian(){
        if(queMin.size() > queMax.size()){
            return queMin.peek();
        }
        return (queMin.peek() + queMax.peek()) / 2.0;
    }
}
