#include <stdio.h>

/**
 * main - creating a file and processing it.
 *
 * Return: 0.
 */
int main()
{
	FILE *fd;

	fd = fopen("cat.txt", "a");
	fprintf(fd, "Hey there! i am tony\n");
	fclose(fd);
	return (0);
}

