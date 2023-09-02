#include <stdio.h>

/**
 * main - prints all possible combinations of two-digit numbers.
 *
 * Return: 0.
 */
int main(void)
{
	int i;
	int j;
	int k;
	int l;
	int m = 0;

	for (i = 0; i < 10; i ++)
	{
		for (j = i + 1; j < 9; j++)
		{
			for (k = i + j; k < 9; k++)
			{
				for (l = k + 1; l < 9; l++)
				{
					putchar(i + '0');
					putchar(j + '0');
					putchar(' ');
					putchar(k + '0');
					putchar(l + '0');
					putchar(',');
				}
			}
		}
	}
	putchar('\n');
}
