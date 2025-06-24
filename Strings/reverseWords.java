public class reverseWords {
    public String reverseWordss(String s) {
        int n=s.length();
        char[] s_arr=s.toCharArray();
        reverse(s_arr,0,n-1);

        int start=0;
        int end=0;
        while(start<n){
            while(start<n && s_arr[start]==' ') start++;

            end=start;
            while(end<n && s_arr[end]!=' ') {
                end++;
            }

            reverse(s_arr,start,end-1);
            start=end;
        }
        return cleanSpaces(s_arr,n);

    }
    public void reverse(char[] s_arr,int i,int j){
        while(i<j){
            char temp=s_arr[i];
            s_arr[i]=s_arr[j];
            s_arr[j]=temp;
            i++;
            j--;
        }
    }
    public  String cleanSpaces(char[] arr, int n) {
        int i = 0, j = 0;
        while (j < n) {
            // Skip spaces
            while (j < n && arr[j] == ' ') j++;
            // Copy word
            while (j < n && arr[j] != ' ') arr[i++] = arr[j++];
            // Skip spaces and add single space
            while (j < n && arr[j] == ' ') j++;
            if (j < n) arr[i++] = ' ';
        }
        return new String(arr, 0, i);
    }
}
