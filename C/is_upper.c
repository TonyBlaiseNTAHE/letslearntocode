#include <stdio.h>

/**
 * _isupper - checks for uppercase character.
 * @c: checks for uppercase.
 * Return: 1 if c is upper
 *         0 otherwise.
 */
int _isupper(int c)
{
	if (c >= 'A' && c <= 'Z')
		return (1);
	else
		return (0);
}
/**
 * main - main entry.
 *
 * Return: 0.
 */
int main(void)
{
	char c;
	
	c = 'A';
	printf("%c: %d\n", c, _isupper(c));
	c = 'a';
	printf("%c: %d\n", c, _isupper(c));
	return (0);
}
