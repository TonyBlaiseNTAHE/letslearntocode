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
		for (j = i; j >= 1; j--)
		{
			printf("%d ", j);
		}
		printf("\n");
	}
	return (0);
}
