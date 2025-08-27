public class minRecolours {
    public int minimumRecolors(String b, int k) {
       int n=b.length();
       int white=0;
    
       for(int i=0;i<k;i++){
          if(b.charAt(i)=='W') white++;
       }
       int min=white;
       for(int i=k;i<n;i++){
         if(b.charAt(i-k)=='W') white--;
         if(b.charAt(i)=='W') white++;
         min=Math.min(white,min);
       }
       return min;
    }
}
