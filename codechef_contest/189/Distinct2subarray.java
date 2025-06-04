
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    Set<Integer> set=new HashSet<>();
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        set.add(arr[i]);
		    }
		    if(set.size()<2){
		        System.out.println(-1);
		        continue;
		    }
		    int min=-1;
		    for(int i=0;i<n;i++){
		        if(arr[i]!=arr[i+1])
		        {
		            min=2;
		            break;
		        }
		    }
		    System.out.println(min);
            sc.close();
		}
	}
}
