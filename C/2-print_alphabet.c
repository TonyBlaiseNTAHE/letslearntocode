#include <stdio.h>

/**
 * main - prints alphabet.
 *
 * Return: 0.
 */
int main(void)
{
	char c = 'a';

	 while (c <= 'z')
	{
		if (c == 'z')
		{
			c = 'A';
			while (c <= 'Z')
			{
				putchar (c);
				c++;
			}
			putchar('\n');
			break;
		}
		putchar(c);
		c++;
	}
	return (0);
}
