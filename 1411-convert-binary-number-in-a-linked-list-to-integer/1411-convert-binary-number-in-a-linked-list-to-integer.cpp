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
 #include<string>
#include <cmath>
class Solution {
public:
    int length(ListNode* head){
        int count=0;
        while(head!=NULL){
            count++;
            head=head->next;
        }
        return count;



     }
    int getDecimalValue(ListNode* head) {
        int n=length(head);
        int res=0;
        int count=n-1;
        while(head!=NULL){
             res = res + head->val * pow(2, count);
            head=head->next;
            count--;
        }
        return res;
        
        
    }
};