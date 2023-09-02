#include <stdio.h>

/**
 * main - main function.
 *
 * Return: 0.
 */
int main(void)
{
	int mask = 0b10000000;
	char c = '1024';
	int i;

	for (i = 0; i <= 7; i++)
	{
		printf("%c ", c & mask ? '1' : '0');
		mask >>= 1;
	}
	printf("\nc'%c' is %d\n", c, c);
	return (0);
}
