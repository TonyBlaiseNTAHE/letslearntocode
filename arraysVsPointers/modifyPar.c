#include <stdio.h>

/**
 * modif_paramer - modify variable using parameter.
 * @m: pointer.
 * Return: nothing.
 */
void modif_paramer(int *m)
{
	printf("Value of m is %p\n", m);
	printf("Address of m is %p\n", &m);
	*m = 100;
}

/**
 * main - main entry.
 *
 * Return: 0.
 */
int main(void)
{
	int n;
	int *p;

	n = 10;
	p = &n;
	printf("Value of n is %d\n", n);
	printf("Address of n is %p\n", &n);
	printf("Value of p is %d\n", *p);
	printf("Address of p is %p\n", p);
	modif_paramer(p);
	printf("After dereferencing we get\n");
	printf("Value of n is %d\n", n);
	printf("Address of n is %p\n", &n);
	printf("Address of p is %p\n", p);
	return (0);
}
