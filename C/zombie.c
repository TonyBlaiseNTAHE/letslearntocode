#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>


void infinite_while(void)
{
    pid_t child; 
    while (1)
    {
        child = fork();
        if(child < 0)
        {
            perror("fork");
            exit(EXIT_FAILURE);
        }
        else if (child == 0)
        {
            printf("I am the child: pid: %u", getpid());
            sleep(5);
        }
        else {
            printf("Zombie process created, PID: %u", child);
            sleep(5);
        }
}
}
int main()
{
    infinite_while();
    return 0;
}
