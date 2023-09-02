#include <stdio.h>

/**
 * NOT - function that uses NOT operator.
 */
void NOT()
{
	int a = 6; /* 0b00000110*/
	int result;

	result = ~a; /* -7 = 0b00000111*/
	printf("%d\n", result);
}

/**
 * main - main fucntion.
 *
 * Return: 0.
 */
int main(void)
{
	NOT();
}
