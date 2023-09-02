#include <stdio.h>
int get_bit(unsigned long int n, unsigned int index)
{
    unsigned long int mask = 1 << index;
    int j, i;
    j = n & mask;
    if (j != 0)
    {
        i = 1;
    }
    else
    i = 0;
    return(i);
}
int main(void)
{
    int n;

    n = get_bit(8, 0);
    printf("%d\n", n);
    n = get_bit(28, 1);
    printf("%d\n", n);
    n = get_bit(18, 2);
    printf("%d\n", n);
    n = get_bit(49, 3);
    printf("%d\n", n);
    n = get_bit(34, 4);
    printf("%d\n", n);
    n = get_bit(45, 5);
    printf("%d\n", n);
    n = get_bit(67, 6);
    printf("%d\n", n);
    n = get_bit(80, 7);
    printf("%d\n", n);
    return (0);
}
