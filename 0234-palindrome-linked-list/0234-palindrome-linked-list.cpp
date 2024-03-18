/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
    private:
        bool checkpalindrome(vector<int> arr){
            int s=0;
            int l=arr.size()-1;
            while(s<=l){
                if(arr[s]!=arr[l]){
                    return false;
                }
                s++;
                l--;
            }
            return true;
        }
#include<vector>
public:
    bool isPalindrome(ListNode* head) {
        vector<int>arr;
        while(head!=NULL){
            arr.push_back(head->val);
            head=head->next;
        }
        return checkpalindrome(arr);
    }
};