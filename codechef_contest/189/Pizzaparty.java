import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int boys=sc.nextInt();
		int girls=sc.nextInt();
		boys+=1;
		int req=boys*4+girls*3;
		System.out.println((int)Math.ceil((float)req/8));
        sc.close();
		
	}
}

// Pizza Party
// Chef is hosting a pizza party and has invited 
// A boys and B girls. Don't forget to include Chef himself; he is a boy.

// It is known that a boy eats
// 4 slices of pizza while a girl eats
// 3 slices of pizza. Further, a single pizza comes with 
// 8 total slices of pizza.

// How many pizzas does Chef need to ensure nobody remains hungry? It is fine to waste some of the food.

// Input Format
// The first and only line of input contains 
// 2
// 2 integers - 
// A
// A and 
// B
// B, the number of boys and girls invited to the party.
// Output Format
// For each test case, output on a new line the number of pizzas needed.
