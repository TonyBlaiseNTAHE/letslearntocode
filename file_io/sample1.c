#include <stdio.h>

/**
 * main - creating a file and processing it.
 *
 * Return: 0.
 */
int main()
{
	FILE *fd;
	char s[] = "I am Tony and i love programming!\n";

	fd = fopen("ivy.txt", "w");
	/* Processing file.*/
	fputs(s, fd);
	fclose(fd);
	return (0);
}

