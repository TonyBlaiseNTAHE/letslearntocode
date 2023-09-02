#include <stdio.h>

/**
 * _atoi - convert character to integer.
 * @s: pointer to string.
 *
 * Return: result.
 */
int _atoi(char *s)
{
	int result = 0;
	int sign = 1;
	int i = 0;
	

	while (s[i] == '-')
	{
		sign = -1;
		i++;
	}
	
	for (; s[i]; i++)
	{
		if (s[i] >= '0' && s[i] <= '9')
		result = result * 10 + s[i] - '0';
		else if (result > 0)
			break;
	}
	return (sign * result);
}

/**
 * main - check code.
 *
 * Return: 0.
 */
int main(void)
{
	char *str = "tony is the best in all for ---- + + + -- 1234";
	int val = _atoi(str);
	printf("%d\n", val);
	return (0);
}

