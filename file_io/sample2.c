#include <stdio.h>

/**
 * main - creating a file and processing it.
 *
 * Return: 0.
 */
int main()
{
	FILE *fd;

	fd = fopen("tony.txt", "w");
	/* Processing file.*/
	fprintf(fd, "I am tony and i love coding!\n");
	fclose(fd);
	fd = fopen("cat.txt", "w");
	fputs("miaoh", fd);
	fputs("miaoh\n", fd);
	fputs("hi\n", fd);
	fputc(65, fd);
	fputc(10, fd);
	fclose(fd);
	fd = fopen("cat.txt", "a");
	fprintf(fd, "Hey there! i am tony\n");
	fclose(fd);
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

