#include <unordered_map>

class Solution {
public:
    int climbStairs(int n) {
        std::unordered_map<int, int> memo;
        return climbStairsHelper(n, memo);
    }
    
    int climbStairsHelper(int n, std::unordered_map<int, int>& memo) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo.find(n) != memo.end()) {
            return memo[n];
        }
        int ways = climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2, memo);
        memo[n] = ways;
        return ways;
    }
};




//This is my solution 

// class Solution {
// public:
//     int climbStairs(int n) {
//         if(n<0){
//             return 0;
//                     }
//         if(n==0){
//             return 1;
//         }
//         return climbStairs(n-1)+climbStairs(n-2);
        
//     }
// };
