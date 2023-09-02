#include <stdio.h>

/**
 * add - add two numbers.
 * @x: first number.
 * @y: second number.
 */
void add(int x, int y)
{
	printf("The sum of %d and %d is %d\n", x, y, x + y);
}
/**
 * div - divise two numbers.
 * @x: first number.
 * @y: second number.
 */
void div(int x, int y)
{
	printf("The division of %d and %d is %d\n", x, y, x / y);
}
/**
 * mult - multiply two numbers.
 * @x: first number
 * @y: second number.
 */
void mult(int x, int y)
{
	printf("The multiplication of %d and %d is %d\n", x, y, x * y);
}
/**
 * mod - modulor of two number.
 * @x: first number.
 * @y: second number.
 */
void mod(int x, int y)
{
	printf("The modular of %d and %d is %d\n", x, y, x % y);
}

/**
 * main - main function.
 *
 * Return: 0.
 */
int main(void)
{
	// fun_ptr_arr is an array of function pointers
	void (*fun_ptr_arr[])(int, int) = {add, div, mult, mod};
	unsigned int choice,  a, b;
	printf("Enter your first number: ");
	scanf("%d", &a);
	printf("Enter your second number: ");
	scanf("%d", &b);
	printf("Here are the choice:\n0) addition\n1) division\n2) multiplication\n3) modular\n");
	printf("Enter your choice here -> : ");
	scanf("%d", &choice);
	if (choice > 3)
		return (0);
	(*fun_ptr_arr[choice])(a, b);
	return (0);
}
