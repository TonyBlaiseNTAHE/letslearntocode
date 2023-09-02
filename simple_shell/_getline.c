#include "shell.h"

/**
 * getline - read input from the stream
 *
 * Return: the number of character readed.
 */
char *_getline(void)
{
	size_t len = 0;
	FILE *stream = stdin;
	ssize_t n_char = getline(&lineptr, &len, stream);

	if (n_char == -1)
	{
		if (feof(stream))
		{
			if (isatty(fileno(stream)))
			{
				write(1, "\n", 1);
			}
			exit(0);
		}
		perror("");
		exit(1);
	}
	lineptr[n_char + 1] = '\0';
	return (lineptr);
}
