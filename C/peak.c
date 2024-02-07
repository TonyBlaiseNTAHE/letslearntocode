#include <stdio.h>

int peak_num(int *arr, int size) {
    for (int i = 1; i < size - 1; i++) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            return arr[i];
        }
    }
    return -1; // Indicates no peak found
}

int main() {
    int array[] = {-2,-4,2,1};
    int n = peak_num(array, sizeof(array) / sizeof(array[0]));
    if (n != -1) {
        printf("Peak number: %d\n", n);
    } else {
        printf("No peak found\n");
    }
    return 0;
}

