#include <iostream>
using namespace std;

// Function to search in the array: return the index if item is found, otherwise return -1
int linearSearch(int arr[], int size, int target) {
    if (size == 0) {
        return -1;
    }

    for (int i = 0; i < size; i++) {
        if (arr[i] == target) {
            return i;
        }
    }

    return -1;
}

// Function to search for the target: return true if found, otherwise false
bool linearSearch2(int arr[], int size, int target) {
    if (size == 0) {
        return false;
    }

    for (int i = 0; i < size; i++) {
        if (arr[i] == target) {
            return true;
        }
    }

    return false;
}

int main() {
    int arr[] = {18, 12, 19, 14, 77, 50};
    int target = 14;
    int size = sizeof(arr) / sizeof(arr[0]);

    // Calling the functions and displaying the results
    cout << "Index of target: " << linearSearch(arr, size, target) << endl;
    cout << "Does target exist: " << (linearSearch2(arr, size, target) ? "Yes" : "No") << endl;

    return 0;
}
