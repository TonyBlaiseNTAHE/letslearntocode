#include <stdio.h>

/**
 * print_most_numbers - prints the numbers, from 0 to 9, followed by a new line.
 *
 * Return: nothing.
 */
void print_most_numbers(void)
{
	int i;

	for (i = 0; i <= 9; i++)
	{
		if (i != 2 && i != 4)
			printf("%d", i);
	}
	printf("\n");
}
/**
 * main - check the code.
 *
 * Return: Always 0.
 */
int main(void)
{
	print_most_numbers();
	return (0);
}

