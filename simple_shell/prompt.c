#include "shell.h"

/**
 * prompt - display prompt.
 *
 */
void prompt(void)
{
	int signal = 1;

	signal = isatty(0);
	if (signal == 1)
	{
		printf("$ ");
	}
}
