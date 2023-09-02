#include <stdio.h>

/**
 * main - prints the size of datatypes on my machine.
 *
 * Return: 0.
 */
int main(void)
{
	char c;
	int n;
	float f;

	printf("Size of type 'char' on my computer: %lu bytes\n", sizeof(char));
	printf("Size of type 'char' on my computer: %lu bytes\n", sizeof(float));
	printf("Size of type 'char' on my computer: %lu bytes\n", sizeof(int));
	printf("Size of type of my variable n on my computer: %lu bytes\n", sizeof(n));
	return (0);
}
