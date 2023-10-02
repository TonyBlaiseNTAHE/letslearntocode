#include <stdio.h>

int main(void) {
    int array[] = {1, 3, 4, 5, 6};
    int i = 0, j = 0;
    int av;
    int sum = 0;
    int size = sizeof(array) / sizeof(array[0]);

    while (i < size) {
        sum += array[i];
        i++;
    }
    av = sum / size;
    printf("The average is %d\n", av);

    while (j < size) {
        if (array[j] > av) {
            printf("The greatest number greater than the average is %d\n", array[j]);
            break;
        }
        j++;
    }

    return 0;
}





