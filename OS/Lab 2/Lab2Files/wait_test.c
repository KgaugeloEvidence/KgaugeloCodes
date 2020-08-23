#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
int main( ){
	int pid = fork();
	/*if(pid == 0){
		printf( " I’m the child %d\n" , getpid());
		sleep(1);
	}
	else{
		printf("My child is called %d\n",pid);
		wait(NULL);
		printf( "My child has terminated\n");
	}
	printf("That’s it %d\n" , getpid());
return 0;*/
	if(pid == 0){
		return 42;
	}else{
		int res = -5;
		printf("%ls\n",&res);
		wait(&res);
		printf("%d\n",res);
		printf("the result was %d\n" , WEXITSTATUS(res));
	}
}
