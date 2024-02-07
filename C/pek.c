#include <stdio.h>

int peak_num(int *arr, int size) {
    for (int i = 1; i < size - 1; i++) {
        if (arr[i] > arr[i - 1] && arr[i] >= arr[i + 1]) {
            return arr[i];
        }
    }
    // Check if the first or last element is a peak
    if (arr[0] >= arr[1]) {
        return arr[0];
    }
    if (arr[size - 1] >= arr[size - 2]) {
        return arr[size - 1];
    }
    return -1; // Indicates no peak found
}

int main() {
    int array1[] = {1, 2, 4, 6, 3};
    int array2[] = {2, 2, 2};
    int array3[] = {4, 2, 1, 2, 2, 2, 3, 1};

    printf("Peak in array1: %d\n", peak_num(array1, sizeof(array1) / sizeof(array1[0])));
    printf("Peak in array2: %d\n", peak_num(array2, sizeof(array2) / sizeof(array2[0])));
    printf("Peak in array3: %d\n", peak_num(array3, sizeof(array3) / sizeof(array3[0])));

    return 0;
}

