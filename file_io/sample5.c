#include <stdio.h>

/**
 * main - creating a file and processing it.
 *
 * Return: 0.
 */
int main()
{
	FILE *fd;

	fd = fopen("tony.txt", "a");
	char s[] = "I love programming";
	int i;
	for (i = 0; i < 10; i++)
	{
		fputs(s, fd);
		fputc(10, fd);
	}
	fclose(fd);
	return (0);
}

