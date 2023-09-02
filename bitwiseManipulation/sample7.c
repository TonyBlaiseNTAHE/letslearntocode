#include <stdio.h>

/*
 * find_odd - finds odd numbers.
 * @arr: the array
 * @n: the size of element in the array.
 * Return: the old number.
 */
int find_odd(int arr[], int n)
{
	int res = 0, i = 0;

	for (;i < n; i++)
	{
		res ^= arr[i];
	}
	return (res);
}
/**
 * main - main function.
 *
 * Return: 0.
 */
int main(void)
{
	int arr[] = {12, 12, 14, 90, 14, 14 ,14};
	int n = sizeof(arr) / sizeof(arr[0]);
	printf("The odd occurring element is %d\n", find_odd(arr, n));
	return (0);
}
