#include <stdio.h>

/**
 * main - main entry.
 *
 */
void main()
{
	int i; 
	int j;

	for (i = 1; i <= 5; i++)
	{
		for (j = 1; j <= 5; j++)
		{
			printf("%c ", j + 64);
		}
		printf("\n");
	}
}
