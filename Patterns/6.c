#include <stdio.h>

/**
 * main - prints pattern.
 *
 */
void main()
{
	int i, j;

	for (i = 5; i >= 1; i--)
	{
		for (j = i; j <= 5;j++)
		{
			printf("%d ", j);
		}
		printf("\n");
	}
}
