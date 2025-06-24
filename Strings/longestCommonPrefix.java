public class longestCommonPrefix {
    public String longestCommonPrefixx(String[] strs) {
        if(strs.length==1) return strs[0];
        String res="";
        
        String first=strs[0];
        for(int i=0;i<first.length();i++){

            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || first.charAt(i)!=strs[j].charAt(i))
                return res;
            }
            res=res+first.charAt(i);

        }
        return res;

    }
}
