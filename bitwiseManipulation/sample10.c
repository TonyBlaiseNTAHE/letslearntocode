#include <stdio.h>

/**
 * main - main function.
 *
 * Return: 0.
 */
int main(void)
{
	int x = 10;

	(x & 1) ? printf("Odd\n") : printf("Even\n");
	return (0);
}
