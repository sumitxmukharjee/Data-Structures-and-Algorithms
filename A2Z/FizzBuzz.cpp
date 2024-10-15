#include<bits/stdc++.h>
using namespace std;
int main(){

vector<string> ans;

for(int i=1;i<=100;++i){

    if(i%3 == 0 and i%5 == 0){
        ans.push_back("FizzBuzz");
    }

    else if(i%3 == 0 ){
        ans.push_back("Fizz");
    }

    else if(i%5 == 0 ){
        ans.push_back("Buzz");
    }
    else{
        ans.push_back(to_string(i));
    }
}

for(auto& str:ans){
    cout<<str<<endl;
}
 return 0;
}