#include <stdio.h>
#include <stdlib.h>
#define SIZE 100

/**
 * main - main function
 *
 * Return: 0.
 */
int top = -1, array[SIZE];
void push();
void pop();
void print();
int main()
{
	int choice;

	while (1)
	{
		printf("\n Stack implementation:\n");
		printf("\nPlease enter your choice below:\n1.Pop\n2.push\n3.print\n4.exit");
		printf("\n=> ");
		scanf("%d", &choice);
		switch(choice)
		{
			case 1:
				pop();
				break;
			case 2:
				push();
				break;
			case 3:
			       print();
			       break;
			case 4:
			       exit(0);
			       break;
			default:
			       printf("\nInvalid choice!!");
		}
	}
	return (0);
}
/**
 * push - insert element in a stack using array
 *
 */
void push()
{
        int n;
        if (top == SIZE - 1)
        {
                printf("\n Overflow");
        }
        else
        {
                printf("\nEnter element in the stack: ");
                scanf("%d", &n);
		top = top + 1;
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
                printf("\nPopped element is %d", array[top]);
                top = top - 1;
        }
}
void print()
{
	if (top == -1)
	{
		printf("\n underflow!");
	}
	else
	{
		int i;
		printf("\nElements present in the stack: \n");
		for (i = top; i >= 0; i--)
		{
			printf("%d\n", array[i]);
		}
	}
}
