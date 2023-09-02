#include <stdio.h>

/**
 * modif_my_char_var - solve me.
 *
 * Return: nothing.
 */
void modif_my_char_var(char *cc, char ccc)
{
	printf("Value of cc is: %p\n", cc);
	printf("address of cc is: %p\n", &cc);
	printf("Value of ccc is: %d\n", ccc);
	printf("Address of ccc is: %p\n", &ccc);
	*cc = 'o';
	ccc = 'l';
}

/*
 * main - solve me
 *
 * Return: Always 0.
 */
int main(void)
{
	char c;
	char *p;

	p = &c;
	c = 'H';
	printf("Value of c before the call is: %d ('%c')\n", c, c);
	printf("Address of c before the call is: %p\n", &c);
	printf("Value of p before the call is: %d\n", *p);
	printf("Address of p before the call is: %p\n", p);
	modif_my_char_var(p, c);
	printf("Value of c after the call is: %d ('%c')\n", c, c);
	printf("Address of c after the call is: %p\n", &c);
	printf("Value of p after the call is: %d\n", *p);
	printf("Address of p after the call is: %p\n", &p);
	return (0);
}
