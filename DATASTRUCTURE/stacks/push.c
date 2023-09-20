#include "main.h"

/**
 * push - insert element in a stack using array
 *
 */
void push()
{
	top = -1;
	int n;
	if (top == SIZE - 1)
	{
		printf("\n Overflow");
	}
	else
	{
		top = top + 1;
		printf("\Enter element in the stack: ");
		scanf("%d", &n);
		array[top] = n;
	}
}

/**
 * pop - delete element in the stack using array.
 */
void pop()
{
	if (top == -1)
	{
		printf("\n Underflow");
	}
	else
	{
		print("Deleted element is %d", array[top]);
		top = top - 1;
	}
}
void print()
{
	int i;

	for (i = top; i >= 0; --top)
	{
		printf("%d", array[i]);
	}
}
