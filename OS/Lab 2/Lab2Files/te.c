#include <stdio.h>
#include <unistd.h>
int main(){
	for(int i =0; i<3;i++){
		int pid = fork();
		printf("pid = %d\n" , pid);
	}
	return 0;
}
