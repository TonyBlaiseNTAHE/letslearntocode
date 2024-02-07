#include <stdio.h>

int peak_num(int *arr)
{
    int fnum, i, snum, pk, peak;
    
    for (i = 0; arr[i]; i++) {
        fnum = arr[i];
        snum = arr[i + 1];
        peak = arr[i + 2];
        if (peak > fnum && peak > snum) {
            pk = peak;
            fnum = arr[i + 1];
            snum = arr[i + 2];
            peak = arr[i + 3];
            if (peak > fnum && peak > snum) {
                pk = peak;
                return pk;
            }
        }
    }
}
int main() {
    // Write C code here
    int array[] = {1,2,4,6,3};
    int n = peak_num(array);
    printf("%d", n);

    return 0;
}
