// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution
{
public:
    int countDistinctSubarray(int arr[], int n)
   {
       unordered_map<int,int> m;
       unordered_set<int>st;   
       st.insert(arr,arr+n);
       int j=0;
       int count=0;
       int size=st.size();
       for(int i=0;i<n;i++){
           m[arr[i]]++;
           while(m.size() >= size && j<=i){
               count+=n-i;
               m[arr[j]]--;
               if(m[arr[j]]==0) m.erase(arr[j]);
               j++;
           }
       }
       return count;
   }
};


// { Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;++i)
			cin>>a[i];
		Solution ob;	
		cout<<ob.countDistinctSubarray(a,n)<<endl;
	}
	return 0;
}  // } Driver Code Ends