#include <stdio.h>
#include <stdbool.h>

// A compare funtion that is used for searching an integer
// array
bool compare(const void *a, const void *b)
{
	return(*(int *)a == *(int *)b);
}

int search(void *arr, int arr_size, int el_size, void *x, bool compare(const void *, const void *))
{
	int i;
	char *ptr = (char *)arr;

	for(i  = 0; i < arr_size; i++)
	{
		if (compare(ptr + i * el_size, x))
			return (i);
	}
	return (-1);
}

int main(void)
{
	int arr[] = {2, 3, 4, 6, 7, 8, 9, 0};
	int n = sizeof(arr)/sizeof (arr[0]);
	int x = 0;

	printf("the element is on index %d\n", search(arr, n, sizeof(int), &x, compare));
	return (0);
}
