#include <stdio.h>

/**
 * puts_half - prints half of a string, followed by a new line.
 * @str: pointer to string.
 * Return: nothing.
 */
void puts_half(char *str)
{
	int i;
	int count = 0;
	int n;

	for (i = 0; str[i]; i++)
	{
		count++;
	}
	n = (count - 1) / 2;
	for (i = ++n; str[i]; i++)
	{
		printf("%c", str[i]);
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
	char *str;

	str = "0123456789";
	puts_half(str);
	return (0);
}
