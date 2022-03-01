/*
 ============================================================================
 Name        : ExAssignment10.c
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

	printf("Enter the no of lines\n");
	scanf("%d",&limit);
	for(i=1;i<=limit;i++){
		for(j=1;j<=limit-i;j++){
			printf(" ");
		}
		for(j=1;j<=i;j++){
			printf("%c",(char)(j+64));
		}
		for(j=i-1;j>=1;j--){
			printf("%c",(char)(j+64));
		}
	      printf("\n");
	}
	return EXIT_SUCCESS;
}
