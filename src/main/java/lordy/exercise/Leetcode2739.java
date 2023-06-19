package lordy.exercise;

public class Leetcode2739 {

    public int distanceTraveled(int mainTank, int additionalTank) {
        int used = 0;
        while (mainTank >= 5){
            used += 5;
            mainTank -= 5;
            if(additionalTank >= 1){
                mainTank += 1;
                additionalTank--;
            }
        }
        used += mainTank;
        return used * 10;
    }
}
