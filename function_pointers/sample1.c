#include <stdio.h>
#include <unistd.h>

/**
 * _putchar - writes the character c to stdout.
 *@c: the character to print
 *
 * Return: On success 1.
 * On error, -1 is returned, and errno is set appropriately.
 */
int _putchar(char c)
{
	return (write(1, &c, 1));
}

/**
 * print_name - prints a name.
 *
 * Return: nothing.
 */
void print_name_as_it_is(char *name)
{
	while (*name)
	{
		_putchar(*name);
		name++;
	}
	_putchar('\n');
}

/**
 * print_name_up - prints a name in upcase.
 * @name - the name
 * Return: nothing.
 */
void print_name_up(char *name)
{
	while(*name)
	{
		if (*name >= 'a' && *name <= 'z')
		{
			_putchar(*name + 'A' - 'a');
		}
		else
			_putchar(*name);
		name++;
	}
	_putchar('\n');
}
void print_name(char *name, void (*f)(char *))
{
	f(name);
}
/**
 * main - main function.
 *
 * Return: 0
 */
int main(void)
{
	print_name("Tony love Alx", print_name_as_it_is);
	print_name("Tony love alx so much", print_name_up);
	return (0);
}
