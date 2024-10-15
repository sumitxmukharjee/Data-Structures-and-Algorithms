#include <iostream>
using namespace std;

// Recursive binary search function
int bs(int arr[], int start, int end, int target) {
    if (start > end) {
        return -1; // Base case: target not found
    }
    int mid = start + (end - start) / 2;

    if (target == arr[mid]) {
        return mid; // Target found
    } else if (target > arr[mid]) {
        return bs(arr, mid + 1, end, target); // Search in the right half
    }

    return bs(arr, start, mid - 1, target); // Search in the left half
}

// Wrapper function to initiate recursive search
int search(int arr[], int size, int target) {
    return bs(arr, 0, size - 1, target);
}

int main() {
    int arr[] = {3, 4, 6, 7, 9, 12, 16, 17};
    int target = 12;

    // Perform recursive binary search and print the result
    cout << search(arr, sizeof(arr) / sizeof(arr[0]), target) << endl;

    return 0;
}
