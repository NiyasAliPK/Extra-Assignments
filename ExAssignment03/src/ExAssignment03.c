/*
 ============================================================================
 Name        : ExAssignment03.c
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
	char str1[20];
	char str2[20];
	int i,j;
	int count=0,length1=0,length2=0;
	printf("Enter the first string :");
	scanf("%s",str1);
	printf("Enter the second string :");
	scanf("%s",str2);
	for(i=0;str1[i]!='\0';i++){
		length1++;
	}
	for(j=0;str2[j]!='\0';j++){
		length2++;
	}
	if(length1!=length2){
		printf("The strings are not same :(");
	}
	else{
		for(i=0;i<length1;i++){
			if(str1[i]==str2[i]){
				count++;
			}else if(str1[i]!=str2[i]){
				printf("The strings are not same :(");
				break;
			}
		}
		if(count==length1){
			printf("Entered strings are same :)");
		}
	}
	return EXIT_SUCCESS;
}
