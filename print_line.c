#include <stdio.h>

/**
 * print_line - draws a straight line in the terminal.
 * @n: number of times the character _ should be printed.
 * Return: nothing.
 */
void print_line(int n)
{
	int i;

	for (i = 0; i < n; i++)
	{
		if (n <= 0)
		{
			putchar('\n');
		}
		else
			putchar('_');
	}
	putchar('\n');
}

int main(void)
{
	print_line(0);
	print_line(2);
	print_line(10);
	print_line(-4);
	return (0);
}
