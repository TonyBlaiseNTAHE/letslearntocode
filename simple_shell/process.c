#include "shell.h"

/**
 * process - create child process using fork and execute command
 * @argv: arguments.
 * Return: 1 on fail, 0 on sucess.
 */
int process(char *argv[])
{
	pid_t child;
	int status;

	child = fork();
	if (child == -1)
	{
		perror("fork");
		return (1);
	}
	else if (child == 0)
	{
		if (execve(argv[0], argv, NULL) == -1)
		{
			perror("execve");
			return(1);
		}
	}
	else
	{
		wait(&status);
		return (0);
	}
	return (0);
}
