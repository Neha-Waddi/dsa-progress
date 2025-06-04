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
		    int C=sc.nextInt();
		    int[] vit=new int[n];
		    int[] cost=new int[n];
		    for(int i=0;i<n;i++){
		        vit[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        cost[i]=sc.nextInt();
		    }
		    Map<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++){
		        int v=vit[i];
		        int c=cost[i];
		        map.put(v,Math.min(map.getOrDefault(v,c),c));
		    }
		    List<Integer> mincosts=new ArrayList<>(map.values());
		    Collections.sort(mincosts);
		    int tot=0;
		    int max=0;
		    for(int i=1;i<=mincosts.size();i++){
		        tot+=mincosts.get(i-1);
		        int val=C*i-tot;
		        max=Math.max(max,val);
		    }
		    System.out.println(max);
            sc.close();
		}

	}
}
