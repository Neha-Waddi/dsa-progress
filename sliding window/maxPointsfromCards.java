public class maxPointsfromCards {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int max=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        max=lsum;
        int right=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i]+cardPoints[right];
            max=Math.max(max,lsum);
            right--;
        }
        return max;
    }
}
