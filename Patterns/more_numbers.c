#include <stdio.h>

/**
 * more_numbers - prints 10 times the numbers, from 0 to 14
 * followed by a new line.
 *
 */
void more_numbers(void)
{
	int i;
	int j;

	for (i = 0; i < 10; i++)
	{
		for (j = 0; j <= 14; j++)
		{
			printf("%d", j);
		}
		printf("\n");
	}
}

int main(void)
{
	more_numbers();
	return (0);
}
