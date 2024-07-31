
#include <vector>
#include <map>
#include <algorithm>
#include <utility>
class Solution {
public:
    vector<int> sortByBits(vector<int>& arr) {
        // int count=0;
        // vector<pair<int,int>>arr1;
        // // map<int,int>mpp;
        // for(int i=0;i<arr.size();i++){
        //     count=0;
        //     int element=arr[i];
        //     while(element!=0){
        //         if(((element&1)==1)){
        //             count++;
        //         }
        //         element>>=1;
        //     }
        //    arr1.push_back({count,element});
        // }
        // sort(arr1.begin(),arr.end());
        // vector<int> sortedArr;
        // for(auto& i:arr1){
        //     sortedArr(i.second);

        // }
        // return sortedArr;
        
        vector<pair<int, int>> bitCountPairs;

    // Calculate the number of 1s for each element and store it in bitCountPairs
    for (int num : arr) {
        int count = 0;
        int element = num;
        while (element != 0) {
            if ((element & 1) == 1) {
                count++;
            }
            element >>= 1;
        }
        bitCountPairs.push_back({count, num});
    }

    // Sort bitCountPairs: first by bit count, then by the number itself
    sort(bitCountPairs.begin(), bitCountPairs.end());

    // Extract the sorted numbers from bitCountPairs
    vector<int> sortedArr;
    for (auto& pair : bitCountPairs) {
        sortedArr.push_back(pair.second);
    }

    return sortedArr;

    }
};