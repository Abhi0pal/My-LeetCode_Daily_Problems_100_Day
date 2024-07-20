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

int length(ListNode* head){
    int count=0;
    while(head){
        head=head->next;
        count++;
    }
    return count;
}

class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        // int len=length(head)/2;
        // ListNode* temp=head;
        // while(len--){
        //     temp=temp->next;
        // }
        // return temp; 
        

        // second approuch
         ListNode* slow=head;
        ListNode* fast=head;
        while(fast!=NULL&&fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        return slow;
        
    }
};