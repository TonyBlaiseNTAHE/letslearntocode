#include <stdio.h>

/**
 * fun - print a value of an integer.
 * @a: the integer.
 * Return: nothing.
 */
void fun(int a)
{
	printf("The value of a is %d\n", a);
}

int main(void)
{
	void(*fun_ptr)(int) = fun; // '&' removed

	fun_ptr(100); // '*' removed
	return (0);
}
