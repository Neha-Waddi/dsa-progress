public class sumBeauty {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                sum+=(max(freq)-min(freq));
            }
        }
        return sum;
    }
    public int max(int[] freq){
        int max=0;
        for(int i:freq){
            max=Math.max(max,i);
        }
        return max;
    }
    public int min(int[] freq){
        int min=Integer.MAX_VALUE;
        for(int i:freq){
            if(i>0)
            min=Math.min(min,i);
        }
        return min;
    }
}
