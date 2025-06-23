package greedy;

//slope based

public class Candy {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int sum=1;
        int i=1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum++;
                i++;
                continue;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak+=1;
                sum+=peak;
                i++;
            }
            int down=0;
            while(i<n && ratings[i]<ratings[i-1]){
                down+=1;
                sum+=down;
                i++;
            }
            down++;
            if(down>peak){
                sum=sum+down-peak;
            }
        }
        return sum;
    }
}
