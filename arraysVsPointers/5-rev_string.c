#include <stdio.h>

/**
 * _puts - prints a string, followd by a new line, to stdout.
 * @str: pointer to a string.
 */
void rev_string(char *s)
{
	char temp;
	int count = 0;
	int i;

	for (i = 0; s[i]; i++)
	{
		count++;
	}
	for (i = 0; i < count / 2; i++)
	{
		temp = s[i];
		s[i] = s[count - 1 - i];
		s[count - 1 - i] = temp;
	}
}
/**
 * main -checks codes
 *
 * Return: 0.
 */
int main(void)
{
	char s[10] = "My School";

	printf("%s\n", s);
	rev_string(s);
	printf("%s\n", s);
	return (0);
}
