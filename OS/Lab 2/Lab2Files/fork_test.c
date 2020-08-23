/*#include <stdio.h>
#include <unistd.h>
int main(){
	int pid = fork();
	if(pid == 0){
		printf(" I’m the child %d\n", getpid());
	}
	else{
	printf("My child is called %d\n", pid);
	}
	printf("That’s it %d\n" , getpid());
return 0;

}*/
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
int main(){
	int pid;
	int x = 123;
	pid = fork();
	if(pid == 0){
		printf("child: x is %d\n", x);
		x = 42;
		sleep(1);
		printf("child: x is %d\n", x);
	}else{
		printf("mother: x is %d\n", x);
		x = 13;
		sleep(1);
		printf("mother: x is %d\n", x);
		wait(NULL);
	}
	printf("%d\n",x);
	return 0;
}
