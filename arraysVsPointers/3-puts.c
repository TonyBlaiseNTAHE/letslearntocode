#include <stdio.h>

/**
 * _puts - prints a string, followd by a new line, to stdout.
 * @str: pointer to a string.
 */
void _puts(char *str)
{
	int i;

	for (i = 0; str[i]; i++)
	{
		printf("%c", str[i]);
	}
	printf("\n");
}

/**
 * main -checks codes
 *
 * Return: 0.
 */
int main(void)
{
	char *str;

	str = "I do not fear computers. I fear the lack of them - Isaac Asimov";
	_puts(str);
	return (0);
}
