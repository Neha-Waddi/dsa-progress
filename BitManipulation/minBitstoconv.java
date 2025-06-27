package BitManipulation;

public class minBitstoconv {
     public int minBitFlips(int start, int goal) {
        int need=start^goal;

        int count=0;
        while(need>1){
            if((need & 1)==1) count++;
            need=need/2;
        }
        if(need==1) count++;
        return count;
    }
}
