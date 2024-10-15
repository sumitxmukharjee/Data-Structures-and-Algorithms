#include <iostream>
using namespace std;

int main() {
    int n = 7789;

    while (n > 0) {
        int lastDigit = n % 10; // Extract the last digit
        cout << lastDigit << " "; // Print the last digit
        n = n / 10; // Remove the last digit
        cout << n << " "; // Print the remaining number
    }
    cout << endl;

    return 0;
}
