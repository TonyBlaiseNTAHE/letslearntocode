#include <stdio.h>

/**
 * left_shift- function that uses << operator.
 */
void right_shift()
{
	int a = 6; /* 0b00000110*/
	int n = 2;
	int result;

	result = a >> n; /*  0b00011000*/
	printf("%d\n", result);
}

/**
 * main - main fucntion.
 *
 * Return: 0.
 */
int main(void)
{
	right_shift();
}
