/*
 ============================================================================
 Name        : ExAssignment02.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	setbuf(stdout,NULL);
	int limit;
	int k,m=1,i,j;
	printf("Enter a number :");
	scanf("%d",&limit);

	for(i=limit;i>=1;i--){
		for(j=1;j<=i;j++){
			printf(" ");
		}
		for(k=1;k<=m;k++){
			if(k==m){
			printf("1");
			}else{
			printf("%d ",k);
			}
		}
		printf("\n");
		m++;
	}
	return EXIT_SUCCESS;
}
