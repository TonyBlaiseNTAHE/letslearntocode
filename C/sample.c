#include <stdio.h>

/**
 * main - main entry.
 *
 * Return: 0.
 */
int main(void)
{
	int i = 0;

	while (i < 10)
	{
		if (i == 9)
		{
			char c = 'a';
			while (c <= 'f')
			putchar(c);
			c++;
		}
		putchar (i + '0');
		i++;
	}
	putchar ('\n');
	return (0);
}
