/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        if(head==NULL|| head->next==NULL){
            return false;
        }
        //FLOYD DETECT CYCLE
        // ListNode*slow=head;
        // ListNode*fast=head;
        // while(fast!=NULL){
        //     fast=fast->next;
        //     if(fast!=NULL){
        //         fast=fast->next;
        //         slow=slow->next;
        //     }
        //     if(slow==fast){
        //         return true;
        //     }
        // }
        // return false;
         
        //Through Map
        map<ListNode*,bool>mpp;
        ListNode* temp=head;
        while(temp!=NULL){
            if(mpp[temp]==true){
                return true;
            }
            mpp[temp]=true;
            temp=temp->next;
        }
        return false;


    }
}; 