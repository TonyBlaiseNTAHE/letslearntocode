#include <stdio.h>

/**
 * _puts - prints a string, followd by a new line, to stdout.
 * @str: pointer to a string.
 */
void print_rev(char *s)
{
	int i;
	int count = 0;

	for (i = 0; s[i]; i++)
	{
		count++;
	}
	for (i = count--; i >= 0; i--)
	{
		printf("%c", s[i]);
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
	print_rev(str);
	return (0);
}
