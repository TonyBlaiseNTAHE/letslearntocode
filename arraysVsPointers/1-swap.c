#include <stdio.h>

/**
 * swap_int - swaps the value ot two integers.
 * @a: the first integer
 * @b: the second integer.
 * Return: nothing.
 */
void swap_int(int *a, int *b)
{
	int temp;

	temp = *a;
	 *a = *b;
	*b = temp;
}

/**
 * main - checks the codes.
 *
 * Return: 0.
 */
int main(void)
{
	int a;
	int b;

	a = 21;
	b = 20;
	printf("a : %d\n b: %d\n", a, b);
	swap_int(&a, &b);
	printf("a : %d\n b: %d\n", a, b);
	return (0);
}
