/*
1.  *****
    *****
    *****
    *****
    *****
*/
#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    scanf("%d",&n);
    
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            printf("*");
        }
        printf("\n");
    }

    return 0;
}

/*
2.  *
    **
    ***
    ****
    *****
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    scanf("%d",&n);
    
    for(int i=1;i<=m;i++){
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }

    return 0;
}

/*
3.  *****
    ****
    ***
    **
    *
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    scanf("%d",&n);
    
    for(int i=1;i<=m;i++){
        for(int j=m+1-i;j>=1;j--){
            printf("*");
        }
        printf("\n");
    }

    return 0;
}

/*
4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    scanf("%d",&n);
    
    for(int i=1;i<=m;i++){
        for(int j=1;j<=i;j++){
            printf("%d",j);
        }
        printf("\n");
    }

    return 0;
}

/*

5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    scanf("%d",&n);
    
    for(int i=1;i<=2*m-1;i++){
        if(i<=m){
            for(int j=1;j<=i;j++){
                printf("*");
            }
            printf("\n");
        }
        else{
            
            for(int j=2*m-i;j>=1;j--){
                printf("*");
            }
            printf("\n");
        }
    }

    return 0;
}

/*
6.       *
        **
       ***
      ****
     *****
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=1;i<=m;i++){
        for(int j=m-i;j>=1;j--){
            printf(" ");
        }
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}

/*
7.   *****
      ****
       ***
        **
         *
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=1;i<=m;i++){
        for(int j=1;j<i;j++){
            printf(" ");
        }
        for(int j=m;j>=i;j--){
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}

/*
8.      *
       ***
      *****
     *******
    *********
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=0;i<m;i++){
        for(int j=m-i-1;j>0;j--){
            printf(" ");
        }
        for(int j=0;j<2*i+1;j++){
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}

/*

9.  *********
     *******
      *****
       ***
        *
  */

  #include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=0;i<m;i++){
        for(int j=0;j<i;j++){
            printf(" ");
        }
        for(int j=0;j<2*m-2*i-1;j++){
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}

/*

10.      *
        * *
       * * *
      * * * *
     * * * * *
     
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=0;i<m;i++){
        for(int j=m-1;j>i;j--){
            printf(" ");
        }
        for(int j=0;j<=i;j++){
            
            printf("* ");
        }
        printf("\n");
    }
    
    return 0;
}

/*
11.  * * * * *
      * * * *
       * * *
        * *
         *
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=0;i<m;i++){
        for(int j=0;j<i;j++){
            printf(" ");
        }
        for(int j=m-1;j>=i;j--){
            
            printf("* ");
        }
        printf("\n");
    }
    
    return 0;
}

/*
12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *

*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=1;i<=2*m;i++){
        if(i<=m){
            for(int j=0;j<i;j++){
                printf(" ");
            }
            for(int j=m;j>=i;j--){
                printf("* ");
            }
            printf("\n");
        }
        else{
            for(int j=2*m-i;j>=0;j--){
                printf(" ");
            }
            for(int j=1;j<=i-m;j++){
                printf("* ");
            }
            printf("\n");
        }
    }
    return 0;
}

/*
13.      *
        * *
       *   *
      *     *
     *********
*/
#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=1;i<=m;i++){
        for(int j=m;j>i;j--){
            printf(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            if(j==1|| j==2*i-1|| i==m){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
    return 0;
}

/*
14.  *********
      *     *
       *   *
        * *
         *
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=1;i<=m;i++){
        for(int j=1;j<i;j++){
            printf(" ");
        }
        for(int j=1;j<=2*(m-i)+1;j++){
            if(i==1 || j==1||j==2*(m-i)+1)
            printf("*");
            else
            printf(" ");
        }
        printf("\n");
    }
    return 0;
}

/*
15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
    for(int i=0;i<m;i++){
        for(int j=m-1;j>i;j--){
            printf(" ");
        }
        for(int j=1;j<=2*i+1;j++){
            if(j==1 || j==2*i+1)
            printf("*");
            else
            printf(" ");
        }
        printf("\n");
        }
    for(int i=m-1;i>0;i--){
        for(int j=1;j<=m-i;j++){
            printf(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            if(j==1||j==2*i-1)
            printf("*");
            else
            printf(" ");
        }
        printf("\n");
    }
        
    
    return 0;
}

/*
16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
*/

#include <stdio.h>

int main()
{
    int m,n;
    scanf("%d",&m);
    
   for(int i=0;i<m;i++){
       for(int j=0;j<m-i-1;j++){
           printf(" ");
       }
       int val=1;
       for(int j=0;j<=i;j++){
           printf("%1d ",val);
           val=val*(i-j)/(j+1);
       }
       printf("\n");
   }
    return 0;
}

/*


17.      1
        212
       32123
      4321234
       32123
        212
         1
*/

