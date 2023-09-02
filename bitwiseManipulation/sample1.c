#include <stdio.h>

/**
 * AND - function that uses and operator.
 */
void AND()
{
	int a = 6; /* 0b00000110*/
	int b = 5; /* 0b00000101*/
	int result;

	result = a & b; /* 4 = 0b0000100*/
	printf("%d\n", result);
}

/**
 * main - main fucntion.
 *
 * Return: 0.
 */
int main(void)
{
	AND();
}
