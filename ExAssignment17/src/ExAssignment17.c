/*
 ============================================================================
 Name        : ExAssignment17.c
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
	int n1,n2;
	printf("Enter two numbers :\n");
	scanf("%d%d",&n1,&n2);
	int* ptr1=& n1;
	int* ptr2=& n2;
	int* temp;
	temp=ptr1;
	ptr1=ptr2;
	ptr2=temp;
	printf("After swap \n");
	printf("Number 1 = %d\n",*ptr1);
	printf("Number 2 = %d",*ptr2);
	return EXIT_SUCCESS;
}
