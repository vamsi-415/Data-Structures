#include <iostream>
#define MAX 10
using namespace std;

class BinaryHeapADT{
    public:
        void heapSort(int a[MAX],int);
        void buildheap(int a[MAX],int,int); // funtion declarations
};
int main(){
    BinaryHeapADT x;
    int a[MAX],n;
    cout<<"\nenter number of elements";
    cin>>n;
    cout<<"enter the values";
    for (int i=1;i<=n;i++) 
        cin>>a[i];
    cout<<"\nbefore sorting";
    for (int i=1;i<n;i++)
        cout<<a[i]<<" ";
    x.heapSort(a,n);
    cout<<"\n after sorting";
    for (int i=1;i<=n;i++)
        cout<<a[i]<<" ";
    return 0;
        
}
void BinaryHeapADT::heapSort(int a[MAX],int n){
    int i;
    for (i=n/2;i>=1;i--)
        buildheap(a,1,n);
    for(i=n;i>=1;i--){
        int temp=a[1];
        a[1]=a[i];
        a[i]=temp;
        buildheap(a,1,i-1);
    }
}
void BinaryHeapADT:: buildheap(int a[MAX],int root,int bottom){
    int i,t;
    int done=0;
    while(root<=bottom && !done){
        if(2*root==bottom)
            t=2*root;
        else if(a[2*root]<a[bottom])
            t=2*root;
        else
            t=2*root+1;
        if(a[t<a[root]]){
            int temp=a[t];
            a[t]=a[root];
            a[root]=temp;
        
        }
        else
            done=1;
    }
}


