class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int dec=0;
        int power=0;
        for(int i=b.length()-1;i>=0;i--){
            int bit=b.charAt(i)-'0';
            dec+=bit*Math.pow(2,power++);
        }
        return dec;
    }
}