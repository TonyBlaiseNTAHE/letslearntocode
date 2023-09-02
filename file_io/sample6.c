#include <stdio.h>

/**
 * main - creating a file and processing it.
 *
 * Return: 0.
 */
int main()
{
	FILE *fd;
	int i = 0;

	fd = fopen("read.txt", "w");
	/* Processing file.*/
	while (1)
	{
		printf("Enter #: ");
		scanf("%d", &i);
		if (i == -1)
			break;
		else
			fprintf(fd, "%d\n", i);
	}
	fclose(fd);
	FILE *fd_input;

	fd_input = fopen("read.txt", "r");
	int input = 0;
	fscanf(fd_input, "%d", &input);
	printf("NUmber: %d\n", input);
	fclose(fd_input);
	return (0);
}

