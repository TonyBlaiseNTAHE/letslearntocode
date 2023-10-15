#include <stdio.h>

/**
 * print_square - prints a square, followed by a new line.
 * @size: the size of the square.
 * Return:  nothing.
 */
void print_square(int size)
{
	int i;
	int j;

	for (i = 0; i < size; i++)
	{
		for (j = 0; j < size; j++)
		{
			putchar(35);
		}
		if (i != size - 1)
			putchar('\n');
	}
	putchar('\n');
}
int main(void)
{
	print_square(2);
	print_square(10);
	print_square(0);
	return (0);
}
