/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include<stdlib.h>
int main()
{
    int arr1[10][10],arr2[10][10],res[10][10];
    int row,col,row1,col1;
    printf("Enter the row and col val for 1 mat:");;
    scanf("%d %d",&row,&col);
    printf("Enter the element :");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            scanf("%d",&arr1[i][j]);
        }
    }
    printf("Enter the row and col val for 2 mat:");;
    scanf("%d %d",&row1,&col1);
    if(col!=row1){
        printf("cannot multiply for this matrix");
        exit(0);
    }
    printf("Enter the element :");
    for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
            scanf("%d",&arr2[i][j]);
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col1;j++){
            res[i][j]=0;
            for(int k=0;k<col;k++){
                res[i][j] =res[i][j] + arr1[i][k] * arr2[k][j];
                
            }
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col1;j++){
            printf("%d \t",res[i][j]);
        }
        printf("\n");
    }
    return 0;
}
