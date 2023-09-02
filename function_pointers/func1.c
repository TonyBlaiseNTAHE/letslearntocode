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
	// fun_ptr is the function pointer that points to fun()
	void(*fun_ptr)(int) = &fun;

	/* the above line is equivalent of following two
	 void (*fun_ptr)(int);
	 fun_ptr = &fun;*/
	(*fun_ptr)(100);
	return (0);
}
