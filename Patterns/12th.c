#include <stdio.h>

/**
 * main - prints pattern.
 *
 */
void main()
{
	int i, j;

	for (i = 1; i <= 5; i++)
	{
		for (j = 1; j <= 5; j++)
		{
			if (i == 5||j == 1|| i == j)
			printf("*");
			else
				printf(" ");
		}
		printf("\n");
	}
}
