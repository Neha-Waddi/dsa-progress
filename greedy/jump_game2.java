package greedy;

public class jump_game2 {
    public int jump(int[] nums) {
        int jump=0;
        int curr=0;
        int far=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,i+nums[i]);
            if(i==curr){
                curr=far;
                jump++;
            }
        }
        return jump;
    }
}
