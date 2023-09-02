#include <stdio.h>

/**
 * main - swap two number using  ^ operator.
 *
 * Return: 0.
 */
int main(void)
{
	int a = 10;
	int b = 12;

	a ^= b;
	b ^= a;
	a ^= b;
	printf("a: %d\nb: %d\n", a, b);
	return (0);
}
