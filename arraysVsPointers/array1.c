#include<stdio.h>

/**
 * main - illustrates pointers arithmetic
 *
 * Return: Always 0.
 */
int main(void)
{
	int a[5];
	int *p;
	int *p2;

	*a = 98;
	*(a + 1) = 198;
	*(a + 2) = 298;
	a[3] = 389;
	*(a + 4) = 489;
	printf("Value of a[0]: %d\n", *a);
	printf("Value of a[1]: %p\n", &(*(a + 1)));
	printf("Value of a[2]: %d\n", *(a + 2));
	printf("Value of a[3]: %p\n", &(*(a + 3)));
	printf("Value of a[4]: %d\n", *(a + 4));
	printf("-----------------\n");
	p = a + 1;
	printf("Value of p is %p\n", &(*p));
	*p = 98;
	printf("Value of p after deferencing is %d\n", *p);
	p2 = a + 3;
	printf("Value of p2: %p\n", &(*p2));
	*p2 = *p + 1337;
	printf("Value of p2: %p\n", &(*p2));
	return (0);
}
