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

//approach first

//seacond approach is slow or fast

int length(ListNode* head){
    int count=0;
    ListNode* temp=head;
    while(temp!=NULL){
        temp=temp->next;
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


        //approch two
        // if(head==NULL ||head->next==NULL){
        //     return head;

        // }
        ListNode* slow=head;
        ListNode* fast=head->next;
        while(fast!=NULL){
            slow=slow->next;
            fast=fast->next;
            if(fast!=NULL){
                fast=fast->next;
            }
           
        }
        return slow;


        
    }
};