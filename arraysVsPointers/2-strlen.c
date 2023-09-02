#include <stdio.h>

/**
 * _strlen - returns the length.
 * @s: string length.
 * Return: the length.
 */
int _strlen(char *s)
{
	int i;
	int count = 0;

	for (i = 0; s[i]; i++)
	{
		count++;
	}
	return (count);
}

/**
 * main - check the code.
 *
 * Return: Always 0.
 */
int main(void)
{
	char *str;
	int len;

	str = "My first strlen!";
	len = _strlen(str);
	printf("%d\n", len);
	return (0);
}
