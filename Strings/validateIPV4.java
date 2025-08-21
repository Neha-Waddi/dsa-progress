public class validateIPV4 {
    public boolean isValid(String s) {
        // code here
        String[] splits=s.split("\\.");
        
        if(splits.length!=4) return false;
        
        for(String str:splits){
            if (str.length() == 0 || str.length() > 3) return false;
            
            for(char c:str.toCharArray()){
                if(!Character.isDigit(c)) return false;
            }
            if(Integer.parseInt(str)<0 || Integer.parseInt(str)>255 ||
            (str.length()>1&& str.charAt(0)=='0'))
            return false;
        }
        return true;
    }
}
