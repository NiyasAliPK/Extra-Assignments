/*
 ============================================================================
 Name        : ExAssignment15.c
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
	int i,j;
	printf("Enter the number of lines :");
	scanf("%d",&limit);
	int k=limit;
	for(i=1;i<=limit;i++){
		for(j=1;j<=i;j++){
			printf("*");
		}
		for(j=1;j<=k-1;j++){
			printf("  ");
		}
		for(j=1;j<=i;j++){
			printf("*");
		}
		k--;
		printf("\n");
	}
	return EXIT_SUCCESS;
}
