import java.util.*;
 public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
			sc.nextLine();
		    String s=sc.next();
		    
		    int i=0;
		    int ans=0;
		    while(i<n){
		        if(s.charAt(i)=='.')
		        {
		            int len=0;
		            while(i<n && s.charAt(i)=='.'){
		                len++;
		                i++;
		            }
		            ans+=(len+2)/3;
		        }
		        else{
		            i++;
		        }
		    }
		    System.out.println(ans);
		    
		}
	}
}