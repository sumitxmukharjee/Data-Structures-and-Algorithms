#include <iostream>
#include <vector>
#include <limits.h> // For INT_MIN

using namespace std;

int main() {
    // Input array
    vector<int> a = {1, 2, 7, -4, 3, 2, -10, 9, 1};

    int max = INT_MIN;

    // Brute force approach
    /*
    for (int i = 0; i < a.size(); i++) {
        for (int j = i; j < a.size(); j++) {
            int sum = 0;
            for (int k = i; k < j; k++) {
                sum += a[k];
            }
            max = max > sum ? max : sum;
        }
    }
    */

    // Better approach (incorrect logic in original code)
    /*
    for (int i = 0; i < a.size(); i++) {
        int sum = 0;
        for (int j = 0; j < a.size(); j++) {
            sum += a[j];
        }
        max = max > sum ? max : sum;
    }
    */

    // Optimal - Kadane's Algorithm
    int sum = 0;
    for (int i = 0; i < a.size(); i++) {
        sum += a[i];

        if (sum > max) {
            max = sum;
        }
        if (sum < 0) {
            sum = 0;
        }
    }
    cout << max << endl;

    return 0;
}
