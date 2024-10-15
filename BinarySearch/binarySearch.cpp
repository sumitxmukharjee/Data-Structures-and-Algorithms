#include <iostream>
using namespace std;

// Function to perform binary search
int search(int arr[], int size, int target) {
    int start = 0;
    int end = size - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (target > arr[mid]) {
            start = mid + 1;
        } else if (target < arr[mid]) {
            end = mid - 1;
        } else {
            return mid; // Return the index of the found target
        }
    }

    return -1; // Return -1 if the target is not found
}

int main() {
    int arr[] = {3, 4, 6, 7, 9, 12, 16, 17};
    int target = 12;

    // Perform binary search and print the result
    cout << search(arr, sizeof(arr) / sizeof(arr[0]), target) << endl;

    return 0;
}
