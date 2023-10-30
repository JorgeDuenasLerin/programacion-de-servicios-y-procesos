#include <stdio.h>

int main(int argc, const char** argv){
    int n = 42;
    int nums[] = {3,4,5};

    fprintf(stdout, "¿WTF? %d\n", nums[0]);
    incRef(nums); //*nums
    fprintf(stdout, "¿WTF? %d\n", nums[0]);
    fprintf(stdout, "¿WTF? %d\n", nums[1]);
}