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
public:
    int TotalLength(ListNode* head){
        int length=0;
        // ListNode* temp=head;
        while(head!=NULL){
            length++;
            head=head->next;
        }
        return length;

    }

    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        int length=TotalLength(head);
        int TravelLength=length-n;
        if(length==n){
            ListNode* temp=head->next;
            return head->next;
            delete temp;
        }
        ListNode* prev=NULL;
        ListNode* temp=head;
        while(TravelLength--){
            //now here we update he prev through temp
            //prev will be null
            //temp=head
            // update these value 
            // until it reach to Zero
            prev=temp;
            temp=temp->next;
        }
        prev->next=temp->next;
        delete(temp);
        return head;
    }
};