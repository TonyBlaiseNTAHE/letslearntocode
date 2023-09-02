#include <stdio.h>

/**
 * is_98 - check if a number is equal to 98.
 * @elem: the integer to check
 *
 * Return: 0 if false, sothing else otherwise
 */
int is_98(int elem)
{
	return(98 == elem);
}

/**
 * is_strictly_postive - check if a number is greater than 0.
 * @elem: the integer to check
 * Return: 0 if false, something else otherwise.
 */
int is_strictly_positive(int elem)
{
	return (elem > 0);
}

/**
 * abs_is_98 - check if the absolute value of a number is 98
 * @elem: the integer to check.
 * Return: 0 if false, something else otherwise.
 */
int abs_is_98(int elem)
{
	return (elem == 98 || -elem == 98);
}
/**
 * int_index - function that searches for an integer.
 * @array: the array
 * @size: size of the array.
 * @cmp: function pointer.
 * Return: the index of the element found.
 *        -1 if not found.
 *        -1 if size <= -1
 */
int int_index(int *array, int size, int (*cmp)(int))
{
	int i = 0;

	if (size <= 0)
		return (-1);
	while (i < size)
	{
		if (cmp(array[i]))
			return (i);
		i++; 
	}
	return (-1);
}
int main(void)
{
	int array[20] = {0, -98, 98, 402, 1024, 4096, -1024, -98, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 98};
	int index;

	index = int_index(array, 20, is_98);
	printf("%d\n", index);
	index = int_index(array, 20, abs_is_98);
	printf("%d\n", index);
	index = int_index(array, 20, is_strictly_positive);
	printf("%d\n", index);
	return (0);
}
