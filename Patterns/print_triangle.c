#include <stdio.h>

/**
 * print_triangle - prints a triangle, followed by a new line.
 * @size: the size of the triangle.
 */
void print_triangle(int size)
{
	int i;
	int j;
	int k;

	for (i = 1; i <= size; i++)
	{
		for (k = size; k>= i;k--)
		{
			printf(" ");
		}
		for(j = 1; j <= i;j++)
		{
			printf("#");
		}
		printf("\n");
	}
	if (size <= 0)
		printf("\n");
}
void print_triangle();
int main(void)
{
	print_triangle(2);
	print_triangle(10);
	print_triangle(1);
	print_triangle(0);
	return (0);
}
