#include <stdio.h>

/**
 * main - main entry.
 *
 * Return: 0.
 */
int main(void)
{
	int i, j;

	for (i = 1; i <= 5; i++)
	{
		for (j = 1; j <= 5; j++)
		{
			printf("%d ", i);
		}
		printf("\n");
	}
	return (0);
}
