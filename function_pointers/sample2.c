#include <stdio.h>

/**
 * print_elem - function that prints elements.
 * @elem: the integer to print.
 *
 */
void print_elem(int elem)
{
	printf("%d\n", elem);
}
/**
 * print_elm_hex - function that prints elements in hexa
 * @elem - element to print.
 */
void print_elm_hex(int elem)
{
	printf("0x%x\n", elem);
}
/**
 * array_iterator - function that executes a function given as parameter
 * on each element of an array.
 * @array: the array
 * size: the size of the array.
 * @action: function pointer.
 */
void array_iterator(int *array, size_t size, void (*action)(int))
{
	int i = 0;

	while (i < size)
	{
		action(array[i]);
		i++;
	}
}
/**
 * main - check the code
 *
 * Return: Always 0.
 */
int main(void)
{
	int array[5] = {0, 98, 402, 1024, 4096};

	array_iterator(array, 5, print_elem);
	array_iterator(array, 5, print_elm_hex);
	return (0);
}
