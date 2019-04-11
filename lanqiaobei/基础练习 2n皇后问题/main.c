#include<stdio.h>
 
#include<string.h>
 
#include<math.h>
 
#define MAXSIZE 1000
 
int bqueen[MAXSIZE];//黑皇后
 
int wqueen[MAXSIZE];//白皇后
 
int chessboard[MAXSIZE][MAXSIZE];//1:能放  0:不能放  
 
int count =0;
 
int n;
 
int place(int k);
 
int BlackQueen(int k)
 
{
 
    int i;
 
    int j;
 
    for(i =0; i < k -1; i++)
 
    {
 
        int judge = bqueen[i]- bqueen[k -1];
 
        if(judge ==0|| fabs(k -1- i)== fabs(judge))
 
            return 0;
 
    }
 
    if(k == n)
 
    {
 
        count++;
 
        return 0;
 
    }
 
    for( j =0; j < n; j++)
 
    {
 
        if(j != wqueen[k]&& chessboard[k][j])
 
        {
 
            bqueen[k]= j;
 
            BlackQueen(k +1);
 
        }
 
       
 
    }
 
       
 
   
 
}
 
int WhiteQueen(int k)
 
{
 
    int i;
 
    int j;
 
    for( i =0; i < k -1; i++)
 
    {
 
        int judge = wqueen[i]- wqueen[k -1];
 
        if(judge ==0|| fabs(k -1- i)== fabs(judge))
 
            return 0;
 
    }
 
    if(k == n)
 
    {
 
        BlackQueen(0);
 
        return 0;
 
    }
 
    for( j =0; j < n; j++)
 
    {
 
        if(chessboard[k][j])
 
        {
 
            wqueen[k]= j;
 
            WhiteQueen(k +1);
 
        }
 
       
 
    }
 
       
 
       
 
}
 
 
 
int main(void)
 
{   int i;
 
    int j;
 
   // freopen("input3.txt","r",stdin);//这是我直接从文件中读取数据
 
    scanf("%d",&n);
 
    for(i =0; i < n; i++)
 
        for(j =0; j < n; j++)
 
        scanf("%d",&chessboard[i][j]);
 
    WhiteQueen(0);
 
    printf("%d\n",count);

    return 0;
 
}
