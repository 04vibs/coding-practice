#include <iostream>
using namespace std;
int firstOccurance(int a[],int n, int key) {
    int s=0;
    int e = n-1;
    int ans=-1;

    while(s<=e){
        int mid = (s+e)/2;

        if(a[mid]==key) {
            ans = mid;
            e = mid-1;
        } else if(a[mid]>key){
            e=mid-1;
        } else {
            s = mid+1;
        }
    }
    return ans;
}
int lastOccurance(int a[],int n, int key) {
    int s=0;
    int e = n-1;
    int ans=-1;

    while(s<=e){
        int mid = (s+e)/2;

        if(a[mid]==key) {
            ans = mid;
            s = mid+1;
        } else if(a[mid]>key){
            e=mid-1;
        } else {
            s = mid+1;
        }
    }
    return ans;
}
int main() {
    int a[]={1,2,3,4,4,5,6,6,6,6,6,8,9};
    int n = sizeof(a)/sizeof(int);

    int key;
    cin>>key;

    cout<<"first occurance of element at index"<<firstOccurance(a,n,key)<<endl;
    cout<<"last occurance of element at index "<<lastOccurance(a,n,key)<<endl;
    return 0;
}
