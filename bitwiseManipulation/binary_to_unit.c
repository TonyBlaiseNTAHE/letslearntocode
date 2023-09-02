#include <stdio.h>
#include <string.h>

/**
 * binary_to_uint - function that changes binary to unsigned int.
 * @b: point to string of 0 and 1 chars.
 * Return: the converted string.
 */
unsigned int binary_to_uint(const char *b)
{
	unsigned int res  = 0;

	if (b == NULL)
		return (0);
	while (*b)
	{
		if (*b != '0' && *b != '1')
		{
			return (0);
		}
		else
			res = (res << 1) + (*b - '0');
		b++;
	}
	return (res);
}
/**
 * main - check the code
 *
 * Return: Always 0.
 */
int main(void)
{
    unsigned int n;

    n = binary_to_uint("1");
    printf("%u\n", n);
    n = binary_to_uint("101");
    printf("%u\n", n);
    n = binary_to_uint("1e01");
    printf("%u\n", n);
    n = binary_to_uint("1100010");
    printf("%u\n", n);
    n = binary_to_uint("0000000000000000000110010010");
    printf("%u\n", n);
    return (0);
}
