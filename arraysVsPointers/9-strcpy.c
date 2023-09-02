#include <stdio.h>

/**
 * _strcpy - copies the string pointed to by src, including
 * the terminating null byte(\0), to the buffer pointed to by dest.
 * @dest: destination string.
 * @src: source string.
 * return: dest.
 */
char *_strcpy(char *dest, char *src)
{
	int i;

	for (i = 0; src[i]; i++)
	{
		dest[i] = src[i];
	}
	dest[i++] = '\0';
	return (dest);
}

/**
 * main - check the code
 *
 * Return: Always 0.
 */
int main(void)
{
	char s1[98];
	char *ptr;

	ptr = _strcpy(s1, "First, solve the problem. Then, Write the code\n");
	printf("%s", s1);
	printf("%s", ptr);
	return (0);
}
