#include <bits/stdc++.h>
using namespace std;

int main() {
    string str;
    cin>>str;
    int arr[26]={0};
    for(int i=0;i<str.length();i++)
    {
        arr[str[i]-'a']++;
    }
    for(int i=0;i<str.length();i++)
    {
        if(arr[str[i]-'a']==1)
        {
            cout<<str[i];
            break;
        }
    }
    return 0;
}
