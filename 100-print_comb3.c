#include <stdio.h>

/**
 * main - print possible combination of two digits.
 *
 * Return: 0.
 */
int main(void)
{
	int i;
	int j;
	int l;
	int k = 0;

	for (i = 0; i < 8; i++)
	{
	for (j = i + 1; j <= 8; j++)
	{
		for (l = j + 1; l <= 9; l++)
		{
		if (k > 0)
		{
			putchar(',');
			putchar(' ');
		}
		putchar(i + '0');
		putchar(j + '0');
		putchar(l + '0');
		k++;
	}
	}
	}
	putchar('\n');
	return (0);
}
