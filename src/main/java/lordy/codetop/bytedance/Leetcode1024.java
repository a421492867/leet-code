package lordy.codetop.bytedance;

import java.util.Arrays;

public class Leetcode1024 {

    public int videoStitching(int[][] clips, int time){
        Arrays.sort(clips, ((o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        }));

        if(clips[0][0] != 0) return -1;
        int r = clips[0][1];
        int index = 0;
        while (index < clips.length && clips[index][0] == 0){
            r = Math.max(r, clips[index][1]);
            index++;
        }

        int cnt = 1;
        for(int i = index; i < clips.length; ++i){
            if(r >= time) return cnt;
            if(clips[i][0] > r){
                if(r < time) return -1;
            }else {
                int tmp = r;
                int j = i;
                while (j < clips.length && clips[j][0] <= r){
                    tmp = Math.max(tmp, clips[j][1]);
                    j++;
                }
                r = tmp;
                cnt++;
                i = j > i ? j - 1 : i;
            }
        }
        return r >= time ? cnt : -1;
    }

    public static void main(String[] args) {
        Leetcode1024 l = new Leetcode1024();
        l.videoStitching(new int[][]{{0,2}, {1,6}, {3,10}}, 10);
    }
}
