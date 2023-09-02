#include "shell.h"

/**
 * main - main function.
 *
 * Return: 0.
 */
char *lineptr = NULL;
int main(void)
{
	char *s;
	while (run)
	{
		prompt();
		s = _getline();
		printf("%s", s);
	}
	return (0);
}
