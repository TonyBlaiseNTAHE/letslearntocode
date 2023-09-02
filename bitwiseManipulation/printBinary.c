#include <stdio.h>

/**
 * print_binary - print binary from decimal.
 * @n: the number ot convert
 */
void print_binary(unsigned long int n)
{
	unsigned long int mask = 1UL << (sizeof(unsigned long int) * 8 - 1);
	int flag = 0; /* keep trck of leading 0s*/
	
	while (mask != 0)
	{
		if (n & mask)
		{
			putchar(49);
			flag = 1;
		}
		else
		{
			if (flag)
			{
				putchar(48);
			}
		}
		mask >>= 1;
	}
	if (!flag)
	{
		putchar(48);
	}
}
/**
 * main - check the code
 *
 * Return: Always 0.
 */
int main(void)
{
    print_binary(0);
    printf("\n");
    print_binary(1);
    printf("\n");
    print_binary(98);
    printf("\n");
    print_binary(1024);
    printf("\n");
    print_binary((1 << 10) + 1);
    printf("\n");
    return (0);
}
