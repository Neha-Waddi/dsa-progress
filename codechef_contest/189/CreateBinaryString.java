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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int max=0;
		    for(int i=0;i<=n;i++){
		        int z=i;
		        int o=n-i;
		        int zo=z*a+o*b+(i*(n-i))*c;
		        int oz=z*a+o*b+(i*(n-i))*d;
		        max=Math.max(max,Math.max(zo,oz));
		        
		    }
		    System.out.println(max);
		    sc.close();
		}

	}
}
