package BitManipulation;

public class divide2nums {
        public int divide(int dividend, int divisor) {

        if(dividend == divisor)
        return 1;
    
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int sign=1;
        if(dividend <=0 && divisor>0 ) sign=-1;
        if(dividend>=0 && divisor<0) sign=-1;

        long num=Math.abs((long)dividend);
        long den=Math.abs((long)divisor);

        int count=0;
        long ans=0;

        while(num >=den){
            count=0;
            while(num>(den<<(count+1))) count++;
            ans=ans+(1<<count);
            num=num-(den*(1<<count));
        }
        // if(ans == (1<<31) && sign==1)   
        //     return Integer.MAX_VALUE;
        return (int)ans*sign;

    }
}
