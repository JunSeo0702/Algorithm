#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int result=0;
    while(n > 0) {
        answer = n % 10;
        result += answer;
        n = n / 10;
    }
    return result;
}