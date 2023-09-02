#include <stdio.h>

/**
 * XOR - function that uses XOR operator.
 */
void XOR()
{
	int a = 6; /* 0b00000110*/
	int b = 5; /* 0b00000101*/
	int result;

	result = a ^ b; /* 7 = 0b00000111*/
	printf("%d\n", result);
}

/**
 * main - main fucntion.
 *
 * Return: 0.
 */
int main(void)
{
	XOR();
}
