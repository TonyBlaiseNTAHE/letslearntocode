#include <stdio.h>

/**
 * main - creating a file and processing it.
 *
 * Return: 0.
 */
int main()
{
	FILE *fd;

	fd = fopen("cat.txt", "w");
	fputs("miaoh", fd);
	fputs("miaoh\n", fd);
	fputs("hi\n", fd);
	fputc(65, fd);
	fputc(10, fd);
	fclose(fd);
	return (0);
}

