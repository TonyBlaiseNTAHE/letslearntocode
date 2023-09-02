#include <stdio.h>

/**
 * print_square - draws sqaure.
 * @size: the size of the square.
 *
 */
void print_square(int size)
{
	int i;
	int j;

	for (i = 1; i <= size; i++)
	{
		for(j = 1; j <= size; j++)
		{
			putchar(35);
		}
		printf("\n");
	}
	if (size <= 0)
		printf("\n");
}

int main(void)
{
	print_square(2);
	print_square(10);
	print_square(0);
	return (0);
}
