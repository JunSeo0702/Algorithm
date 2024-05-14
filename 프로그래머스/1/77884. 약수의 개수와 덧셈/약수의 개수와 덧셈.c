#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int countDivisors(int num) {
    int count = 0;
    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            count++;
        }
    }
    return count;
}

int solution(int left, int right) {
    int result = 0;
    for (int num = left; num <= right; num++) {
        int divisorsCount = countDivisors(num);
        if (divisorsCount % 2 == 0) {
            result += num;
        } else {
            result -= num;
        }
    }
    return result;
}