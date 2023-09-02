#include <stdio.h>

/**
 * puts2 - prints every other character of the string, starting with
 * first character,followed by a new line.
 * @str: point to string.
 */
void puts2(char *str)
{
	int i;

	for (i = 0; str[i]; i++)
	{
		if (str[i] % 2 == 0)
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
	puts2(str);
	return (0);
}
